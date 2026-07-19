package junit.test_suite;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import junit.junit_with_eclipse.com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {

        DailyTasks obj = new DailyTasks();

        int[] input = {5, 3, 2, 4, 1};
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, obj.sortValues(input));
    }
}