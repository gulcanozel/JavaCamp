package javaHomework2;

public class UserManager {
	public void signIn (User user) {
		System.out.println("Sisteme"+" "+ user.getFirstName()+" "+"olarak giri� yap�ld�");
	}
	public void signOut (User user) {
		System.out.println("��k�� yap�ld� :"+ user.getFirstName());
	}

}
