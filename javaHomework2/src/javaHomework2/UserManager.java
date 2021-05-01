package javaHomework2;

public class UserManager {
	public void signIn (User user) {
		System.out.println("Sisteme"+" "+ user.getFirstName()+" "+"olarak giriþ yapýldý");
	}
	public void signOut (User user) {
		System.out.println("Çýkýþ yapýldý :"+ user.getFirstName());
	}

}
