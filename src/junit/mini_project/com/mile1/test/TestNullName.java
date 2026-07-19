package junit.mini_project.com.mile1.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.bean.Student;
import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.service.StudentReport;

public class TestNullName {

    @Test
    public void testNullName() throws Exception {

        Student s = new Student(null, new int[] {10,20,30});

        StudentReport sr = new StudentReport();

        assertEquals("Name is null", sr.validate(s));
    }
}