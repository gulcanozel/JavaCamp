package javaHomework2;

public class InstructorManager extends UserManager {
	public void addToHomework(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " "+ instructor.getLastName()+" "+ "Sisteme ödev yükledi");
	}

}
