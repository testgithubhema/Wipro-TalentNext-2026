package junit.mini_project.com.mile1.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.service.StudentReport;

public class TestNullStudentObject {

    @Test
    public void testNullStudent() throws Exception {

        StudentReport sr = new StudentReport();

        assertEquals("Object is null", sr.validate(null));
    }
}