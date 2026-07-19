package junit.mini_project.com.mile1.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.bean.Student;
import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.service.StudentReport;

public class TestGradeF {

    @Test
    public void testGradeF() {
        Student s = new Student("Ravi", new int[] {20,80,90});
        StudentReport sr = new StudentReport();
        assertEquals("F", sr.findGrade(s));
    }
}