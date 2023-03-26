package assignment.polymorphismAssignment;

public class Students {
	
	public void getStudentDetails(int studentId,String studentName) {
		System.out.println(studentId+" "+studentName);
	}
	public void getStudentDetails(String email,long phoneNumber) {
	System.out.println(email+" " +phoneNumber);
	}
public static void main(String[] args) {
	Students stud=new Students();
	stud.getStudentDetails(10,"Hema");
	stud.getStudentDetails("Hema@gmail.com",8693356746L);
}
}

