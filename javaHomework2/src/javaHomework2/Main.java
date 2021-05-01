package javaHomework2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Gülcan","Özel","glcozl@gmail.com","123456","Java");
		Student student2 = new Student(2,"Seda","Özen","dghh@gmail.com","159159","C#");
		
		Instructor instructor = new Instructor(1, "Engin","Demiroğ","engindemirog@gmail.com","456654","Java");
		
		UserManager userManager = new UserManager();
		userManager.signIn(student1);
		userManager.signOut(student2);
		userManager.signIn(instructor);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToHomework(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.join(student1);
	}
}
