package ucf.assignments;

import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;

public class Item {
    /*
    has string "description"
    has string "dueDate"
    has string "status"
    has localdate "date"
    has boolean "bool"
     */
    String description;
    DatePicker dueDate;
    CheckBox status;

    LocalDate date;
    Boolean bool = false;


    // constructor for Item object: takes description and dueDate parameters
    public Item(String desc, DatePicker dueD, CheckBox stat) {
        /*
        use "this":
        create description
        create due date
        set default status to I
         */
        this.description = desc;
        this.dueDate = dueD;
        this.status = stat;

        dueDate.setOnAction(e -> {
            date = dueDate.getValue();
        });

        status.setOnAction(e -> {
            if(status.isSelected()) {
                bool = true;
            }
            else {
                bool = false;
            }
        });
    }

    // getters and setters for item object

    public String getDescription() {
        // returns description
        return description;
    }

    // takes description parameter
    public void setDescription(String desc) {
        // set description
        this.description = desc;
    }

    public DatePicker getDueDate() {
        // returns dueDate
        return dueDate;
    }

    // takes dueDate parameter
    public void setDueDate(DatePicker d) {
        // set due date
        this.dueDate = d;
    }

    public CheckBox getStatus() {
        // return status
        return status;
    }

    public void setStatus(CheckBox stat) {
        // set status
        this.status = stat;
    }
}
