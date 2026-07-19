package junit.test_suite;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import junit.junit_with_eclipse.com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks obj = new DailyTasks();

        assertTrue(obj.checkPresence("Wipro Technologies", "Wipro"));
        assertFalse(obj.checkPresence("Wipro Technologies", "Infosys"));
    }
}