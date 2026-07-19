package junit.mini_project.com.mile1.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.bean.Student;
import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.service.StudentReport;

public class TestNullMarksArray {

    @Test
    public void testNullMarks() throws Exception {

        Student s = new Student("Manoj", null);

        StudentReport sr = new StudentReport();

        assertEquals("Mark Array is Null", sr.validate(s));
    }
}