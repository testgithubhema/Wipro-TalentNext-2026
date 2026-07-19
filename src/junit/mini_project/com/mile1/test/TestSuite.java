package junit.mini_project.com.mile1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({

TestGradeA.class,
TestGradeF.class,
TestNullStudentObject.class,
TestNullName.class,
TestNullMarksArray.class,
TestFindNumberOfNullMarks.class,
TestFindNumberOfNullNames.class,
TestFindNumberOfNullObjects.class

})

public class TestSuite {

}