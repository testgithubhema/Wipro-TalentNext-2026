package junit.junit_with_eclipse.com.wipro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.junit_with_eclipse.com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {

        DailyTasks obj = new DailyTasks();

        String expected = "Hello World";
        String actual = obj.doStringConcat("Hello", "World");

        assertEquals(expected, actual);
    }
}