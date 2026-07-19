package junit.mini_project.com.mile1.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.bean.Student;
import abstraction_packages_exceptionhandling.tm803_proj3.com.mile1.service.StudentService;

public class TestFindNumberOfNullObjects {

    @Test
    public void testNullObjectCount() {

        Student[] s=new Student[4];

        s[0]=new Student("Sekar",new int[]{35,35,35});
        s[1]=new Student(null,new int[]{11,22,33});
        s[2]=null;
        s[3]=new Student("Manoj",null);

        StudentService ss=new StudentService();

        assertEquals(1,ss.findNumberOfNullObjects(s));
    }
}