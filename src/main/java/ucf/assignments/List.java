package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class List {
    /*
    has a string "title"
    has a list of items "itemList"
    has a string "directory"
     */

    public static String title, directory;
    public static ObservableList<Item> itemList = FXCollections.observableArrayList();


    // constructor
    public List() {
        /*
        using "this":
        set title to "New List"
        create empty item list
         */
        title = "New List";
        itemList = FXCollections.observableArrayList();;
    }



    public String getTitle() {
        // returns title
        return title;
    }

    // takes parameter title
    public void setTitle(String newTitle) {
        // set title
        title = newTitle;
    }

    // takes parameter dir
    public void setDirectory(String dir) {
        /*
        set directory as input
         */
        directory = dir;
    }

    // takes parameter description
    public static void deleteItem(Item it) {
        /*
        remove item from list
         */
        itemList.remove(it);
    }

    public void createFile() throws IOException {
        /*
        create new text file using the directory string
        the file's name is the list's title
        create filewriter
        call write for title
        loop thru items and print desc, date, and status on a line separated by commas
        close writer
         */
        File file = new File(directory + title + ".txt");
        FileWriter writer = new FileWriter(file);

        writer.write(title + "\n");
        System.out.println(title);
        for(Item it : itemList) {
            System.out.println(it.description + it.dueDate.getValue() + it.getStatus().isSelected());
            writer.write(it.description + "," + it.dueDate.getValue() + "," + it.getStatus().isSelected() + "\n");
        }

        writer.close();
    }

    public void loadList(String dir) throws FileNotFoundException {
        /*
        clear list
        open file from provided directory
        create file scanner
        set title as first line
        set delimiter as comma
        loop thru item lines
            create new item
            add to itemList
            set description as first string
            get date as string and convert to localdate
            set item's duedate
            get last in list as boolean and set status
         */

        itemList.clear();
        File file = new File(dir + ".txt");
        Scanner input = new Scanner(file);

        title = input.nextLine();
        input.useDelimiter(",");

        while(input.hasNextLine()) {
            Item it = new Item("", new DatePicker(), new CheckBox());
            itemList.add(it);
            it.description = input.next();
            String date = input.next();
            LocalDate local = LocalDate.parse(date);
            it.dueDate.setValue(local);
            Boolean bool = input.nextBoolean();
            it.status.setSelected(bool);
        }
    }
}
