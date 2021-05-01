package javaHomework2;

public class Student extends User{
	String chosenCourse;
	
	public Student(int id, String firstName, String lastName, String email, String password, String chosenCourse) {
		super(id, firstName, lastName, email, password);
		this.chosenCourse = chosenCourse;
	}
	
	public String getChosenCourse() {
		return chosenCourse;
	}
	public void setChosenCourse(String chosenCourse) {
		this.chosenCourse = chosenCourse;
	}

}
