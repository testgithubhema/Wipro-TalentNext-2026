package junit.mini_project.com.mile1.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.bean.Student;
import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.service.StudentReport;

public class TestGradeD {

    @Test
    public void testGradeD() {

        Student s = new Student("Ravi", new int[] {50, 50, 50});

        StudentReport sr = new StudentReport();

        assertEquals("D", sr.findGrade(s));
    }
}