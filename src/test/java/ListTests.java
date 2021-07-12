/*
    List()
    getTitle()
    setTitle()
    setDirectory()
    createFile()
    writeToFile()
    loadList()
 */

import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import ucf.assignments.Item;
import ucf.assignments.List;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ListTests {

    @Test
    private void testListPass() {
         /*
        create two Lists: expected and actual
        populate expected with the values the method should populate with
        call actual.Item to populate
        call assert equals
        should return true
          */
    }

    @Test
    private void testListFail() {
        /*
        create two Lists: expected and actual
        populate expected with random values
        call actual.List to populate
        call assert equals
        should return false
         */
    }

    @Test
    private void testAddNewItemPass() {
        /*
        create two lists: actual and expected
        add two items to expected's itemList
        add one item to actual's itemList
        call actual.addNewItem
        test if list lengths are the same
        call assert equals
        should return true
         */
    }

    @Test
    private void testAddNewItemFail() {
        /*
        create two lists: actual and expected
        add three items to expected's itemList
        add one item to actual's itemList
        call actual.addNewItem
        test if list lengths are the same
        call assert equals
        should return false
         */
    }

    @Test
    private void testDeleteItemPass() {
        /*
        create two lists: actual and expected
        add one item to expected's itemList
        add two items to actual's itemList
        call actual.deleteItem
        test if list lengths are the same
        call assert equals
        should return true
         */
    }

    @Test
    private void testDeleteItemFail() {
        /*
        create two lists: actual and expected
        add three items to expected's itemList
        add two item to actual's itemList
        call actual.deleteItem
        test if list lengths are the same
        call assert equals
        should return false
         */
    }

    @Test
    private void testEditDescriptionPass() {
        /*
        create a string: expected
        set expected to a string
        create a lists: actual
        add two items to actual.itemList and assign random descriptions
        call actual.editDescription on one of the items and pass same string as expected
        call assert equals
        should return true
         */
    }

    @Test
    private void testEditDescriptionFail() {
        /*
        create a string: expected
        set expected to a string
        create a lists: actual
        add two items to actual.itemList and assign random descriptions
        call actual.editDescription on one of the items and pass diff string than expected
        call assert equals
        should return false
         */
    }

    @Test
    private void testEditDueDatePass() {
        /*
        create a string: expected
        set expected to a string
        create a lists: actual
        add two items to actual.itemList and assign random due dates
        call actual.editDueDate on one of the items and pass same string as expected
        call assert equals
        should return true
         */
    }

    @Test
    private void testEditDueDateFail() {
        /*
        create a string: expected
        set expected to a string
        create a lists: actual
        add two items to actual.itemList and assign random due dates
        call actual.editDueDate on one of the items and pass diff string than expected
        call assert equals
        should return false
         */
    }

    @Test
    private void testEditStatusPass() {
        /*
        create a string: expected
        set expected to a string
        create a lists: actual
        add two items to actual.itemList and assign random statuses
        call actual.editStatus on one of the items and pass same string as expected
        call assert equals
        should return true
         */
    }

    @Test
    private void testEditStatusFail() {
        /*
        create a string: expected
        set expected to a string
        create a lists: actual
        add two items to actual.itemList and assign random statuses
        call actual.editStatus on one of the items and pass diff string than expected
        call assert equals
        should return false
         */
    }

    @Test
    private void testSaveItemsExternallyPass() {
        /*
        create list: list
        set title and populate with a few sample items
        call list.saveItemsExternally
        check if file exists
        use scanner to check if file contents are accurate
         */
    }
}
