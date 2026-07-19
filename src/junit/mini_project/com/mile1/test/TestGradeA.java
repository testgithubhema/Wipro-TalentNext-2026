package junit.mini_project.com.mile1.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.bean.Student;
import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.service.StudentReport;

public class TestGradeA {

    @Test
    public void testGradeA() {
        Student s = new Student("Sekar", new int[] {90,90,90});
        StudentReport sr = new StudentReport();
        assertEquals("A", sr.findGrade(s));
    }
}