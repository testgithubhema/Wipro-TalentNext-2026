package abstraction_packages_exceptionhandling.tm803_proj3;
import abstraction_packages_exceptionhandling.tm803_proj3.Student;
import abstraction_packages_exceptionhandling.tm803_proj3.StudentReport;
import abstraction_packages_exceptionhandling.tm803_proj3.StudentService;
import abstraction_packages_exceptionhandling.tm803_proj3.NullNameException;
import abstraction_packages_exceptionhandling.tm803_proj3.NullMarksArrayException;
import abstraction_packages_exceptionhandling.tm803_proj3.NullStudentObjectException;
public class StudentMain {
	static	Student data[] = new Student[4];
	static{
		for (int i = 0; i <data.length; i++)  	data [i] = new Student ();  	
	 	data [0] = new Student ("Sekar", new int [] {35, 35, 35});
		data [1] = new Student(null, new int[]{11,22,33});
		data [2] = null;
		data [3] = new Student ("Manoj", null);
	}
	public static void main (String args []) {
	 	StudentService studentService = new StudentService ();	
	 	StudentReport studentReport = new StudentReport ();
		System.out.println ("Grade Calculation: ");
		String x = null;
		for (int i = 0; i < data.length; i++) {
			try {
			x = studentReport.validate (data [i]);
			} 
			catch (NullNameException e) {
			x="NullNameException occurred";	
			} 
			catch (NullMarksArrayException e) {
			x="NullMarksArrayException occurred";
			}
			catch (NullStudentObjectException e) { 
			x="NullStudentException occurred "; 
			}
			System.out.println ("GRADE= "+x);
		}
		System.out.println ("Number of Objects with Marks array as null = "+studentService.findNumberOfNullMarks (data));
		System.out.println ("Number of Objects with Name as null= "+studentService.findNumberOfNullNames(data));	
		System.out.println ("Number of Objects that are entirely null= "+studentService.findNumberOfNullObjects(data));
	  }
}
