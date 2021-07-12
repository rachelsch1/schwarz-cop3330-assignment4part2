/*
    Item()
    setDescription()
    getDescription()
    setDueDate()
    getDueDate()
    getStatus()
    setStatus()
 */

import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import ucf.assignments.Item;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ItemTests {
    @Test
    private void testItemPass() {
         /*
        create two Items: expected and actual
        populate expected with the values the method should populate with
        call actual.Item to populate
        call assert equals
        should return true
          */
    }

    @Test
    private void testItemFail() {
        /*
        create two Items: expected and actual
        populate expected with random values
        call actual.Item to populate
        call assert equals
        should return false
         */
    }

    @Test
    private void testSetDescPass() {
        /*
        create string: expected
        set expected to a string
        create item: actual
        call actual.setDescription and pass same string
        call assert equals
        should return true
         */
    }

    @Test
    private void testSetDescFail() {
        /*
        create string: expected
        set expected to a string
        create item: actual
        call actual.setDescription and pass diff string
        call assert equals
        should return false
         */
    }

    @Test
    private void testGetDescPass() {
        /*
        create two strings: expected and actual
        set expected to a string
        create item: item
        set item.setDescription to the same string
        set actual to item.getDescription
        call assert equals
        should return true
         */
    }

    @Test
    private void testGetDescFail() {
        /*
        create two strings: expected and actual
        set expected to a string
        create item: item
        set item.setDescription to diff string
        set actual to item.getDescription
        call assert equals
        should return false
         */
    }

    @Test
    private void testSetDueDatePass() {
        /*
        create string: expected
        set expected to a string
        create item: actual
        call actual.setDueDate and pass same string
        call assert equals
        should return true
         */
    }

    @Test
    private void testSetDueDateFail() {
        /*
        create string: expected
        set expected to a string
        create item: actual
        call actual.setDueDate and pass diff string
        call assert equals
        should return false
         */
    }
    @Test
    private void testGetDueDatePass() {
        /*
        create two strings: expected and actual
        set expected to a string
        create item: item
        set item.setDueDate to the same string
        set actual to item.getDueDate
        call assert equals
        should return true
         */
    }
    @Test
    private void testGetDueDateFail() {
        /*
        create two strings: expected and actual
        set expected to a string
        create item: item
        set item.setDueDate to diff string
        set actual to item.getDueDate
        call assert equals
        should return false
         */
    }
    @Test
    private void testSetStatusPass() {
        /*
        create string: expected
        set expected to a string
        create item: actual
        call actual.setStatus and pass same string
        call assert equals
        should return true
         */
    }
    @Test
    private void testSetStatusFail() {
        /*
        create string: expected
        set expected to a string
        create item: actual
        call actual.setStatus and pass diff string
        call assert equals
        should return false
         */
    }
    @Test
    private void testGetStatusPass() {
        /*
        create two strings: expected and actual
        set expected to a string
        create item: item
        set item.setStatus to the same string
        set actual to item.getStatus
        call assert equals
        should return true
         */
    }
    @Test
    private void testGetStatusFail() {
        /*
        create two strings: expected and actual
        set expected to a string
        create item: item
        set item.setStatus to diff string
        set actual to item.getStatus
        call assert equals
        should return false
         */
    }
    @Test
    private void testMarkCompletePass() {
        /*
        create string: expected
        set expected to "C"
        create item: actual
        call actual.setStatus and pass "I"
        call actual.markComplete
        call assert equals
        should return true
         */
    }
    @Test
    private void testMarkCompleteFail() {
        /*
        create string: expected
        set expected to "F"
        create item: actual
        call actual.setStatus and pass "I"
        call actual.markComplete
        call assert equals
        should return false
         */
    }

    @Test
    private void testMarkIncompletePass() {
        /*
        create string: expected
        set expected to "I"
        create item: actual
        call actual.setStatus and pass "C"
        call actual.markIncomplete
        call assert equals
        should return true
         */
    }

    @Test
    private void testMarkIncompleteFail() {
        /*
        create string: expected
        set expected to "F"
        create item: actual
        call actual.setStatus and pass "C"
        call actual.markIncomplete
        call assert equals
        should return false
         */
    }
}
