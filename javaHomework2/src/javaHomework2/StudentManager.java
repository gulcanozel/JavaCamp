package javaHomework2;

public class StudentManager extends UserManager {
		public void join (Student student) {
			System.out.println(student.getFirstName()+" "+student.getChosenCourse()+" " + "kursuna kayit oldu");
		}
}
