package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

public class ListViewController implements Initializable {
    @FXML
    private TextField listTitle;

    @FXML
    private TableView<Item> table;

    @FXML
    private TableColumn<Item, String> colItem;

    @FXML
    private TableColumn<Item, DatePicker> colDate;

    @FXML
    private TableColumn<Item, CheckBox> colStatus;

    public static List list = new List();

    // start of methods that set up editable table

    public void initialize(URL location, ResourceBundle resources) {
        // call initTable
        initTable();
    }

    private void initTable() {
        // call initCols
        initCols();
    }

    private void initCols() {
        /*
        set description value as "description"
        set due date value as "dueDate"
        set status value as "status"

        call editTableCols
        */
        colItem.setCellValueFactory(new PropertyValueFactory<Item, String>("description"));
        colDate.setCellValueFactory(new PropertyValueFactory<Item, DatePicker>("dueDate"));
        colStatus.setCellValueFactory(new PropertyValueFactory<Item, CheckBox>("status"));

        editableCols();
    }

    private void editableCols() {
        /*
         description:
         set cell as text field
         set value as user input

         due date:
         set cell as text field
         set value as user input

         status:
         set cell as text field
         set value as user input

         set table info to editable
         */

        colItem.setCellFactory(TextFieldTableCell.forTableColumn());
        colItem.setOnEditCommit(e-> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setDescription(e.getNewValue());
        });

        colDate.setOnEditCommit(e-> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setDueDate(e.getNewValue());
        });

        colStatus.setOnEditCommit(e-> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setStatus(e.getRowValue().getStatus());
        });

        table.setEditable(true);
    }

    private void loadData() {
        /*
        add new item to itemList with default info
        set table items as itemList
         */
        list.itemList.add(new Item("description", new DatePicker(), new CheckBox()));

        table.setItems(list.itemList);
    }

    // end of methods that set up editable table

    @FXML
    private void itemAdded(ActionEvent event) {
        /*
        call loadData which adds a new row to the table
         */
        loadData();
    }

    @FXML
    void deleteItemButtonClicked(ActionEvent event) {
        /*
        remove row from tableview
        call List.deleteItem, pass description
         */
        Item it = table.getSelectionModel().getSelectedItem();
        table.getItems().removeAll(it);
        list.deleteItem(it);
    }

    @FXML
    void listTitleEdited(ActionEvent event) {
        /*
        change the list object's title field to the user's input
         */
        list.setTitle(listTitle.getText());
    }

   // @FXML
  //  void markedComplete(ActionEvent event) {
        /*
        change value of item.status to C
         */
   // }

   // @FXML
  //  void markedIncomplete(ActionEvent event) {
        /*
        change value of item.status to I
         */
   // }

    private void clearTable() {
        ObservableList<Item> clr = FXCollections.observableArrayList();
        table.setItems(clr);
    }


    private void loadComplete() {
        /*
        create temp list
        loop through selectedList's items
        if status = selected, add to list
        if status = unselected, skip
        load temp list to table
         */
        ObservableList<Item> comp = FXCollections.observableArrayList();
        for(Item it : list.itemList) {
            System.out.print(it.bool);
            if(it.bool) {
                comp.add(it);
            }
        }
        clearTable();
        table.setItems(comp);
    }

    private void loadIncomplete() {
        /*
        create temp list
        loop through selectedList's items
        if status = unselected, add to list
        if status = selected, skip
        load temp list to table
         */
        clearTable();
        ObservableList<Item> inc = FXCollections.observableArrayList();
        for(Item it : list.itemList) {
            if(!it.getStatus().isSelected()) {
                inc.add(it);
            }
        }
        table.setItems(inc);
    }

    @FXML
    void showCompleteButtonClicked(ActionEvent event) {
        /*
        call loadComplete
         */
        loadComplete();
    }

    @FXML
    void showIncompleteButtonClicked(ActionEvent event) {
        /*
        call loadIncomplete
         */
        loadIncomplete();
    }

    @FXML
    void showAllSelected(ActionEvent event) {
        /*
        set table items to itemList
         */
        table.setItems(list.itemList);
    }

    @FXML
    void saveListButtonClicked(ActionEvent event) throws IOException {
        /*
        (save current list)
        prompt user for directory:
            create new text input dialog
            set title of text input dialog
            set content of input dialog to "please input directory"
            set field as string and show and wait

            create new text field and make editable
            collect user input
            call List.setDirectory
            call List.createDirectory
            call List.saveListExternally
         */
        TextInputDialog textInput = new TextInputDialog();
        textInput.setTitle("Save list");
        textInput.getDialogPane().setContentText("Please input directory:");

        Optional<String> result = textInput.showAndWait();

        TextField input = textInput.getEditor();

        list.setDirectory(input.getText());
        list.createFile();
    }

    @FXML
    void helpButtonClicked() throws IOException {
        /*
        create new stage
        create parent and load help scene
        create new scene
        set scene as parent
        show scene
         */
        Stage stage = new Stage();
        stage.setTitle("Help");
        Parent help = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HelpScene.fxml")));
        Scene scene = new Scene(help);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void deleteListButtonClicked() {
        /*
        clear itemList
        clear list title
        clear table
        reset title box text
         */
        list.itemList.removeAll();
        list.title = "New list";
        clearTable();
        listTitle.setText("New list");
    }

    @FXML
    void loadButtonClicked() throws FileNotFoundException {
        /*
        unfinished
         */
        TextInputDialog textInput = new TextInputDialog();
        textInput.setTitle("Load list");
        textInput.getDialogPane().setContentText("Please input directory, including file name:");

        Optional<String> result = textInput.showAndWait();

        TextField input = textInput.getEditor();

        list.loadList(input.getText());

        table.setItems(list.itemList);
        listTitle.setText(list.getTitle());
    }

}
