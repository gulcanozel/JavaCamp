package eCommerce;

import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.GoogleManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;
import eCommerce.entities.concretes.UserDto;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"Gülcan","Özel","gulcanozel@gmail.com","123456789",true);
		
		
		UserManager userManager=new UserManager(new HibernateUserDao(),  new GoogleManager());			
		userManager.add(user);
		
		
		AuthManager authManager=new AuthManager(new UserManager(new HibernateUserDao(), new GoogleManager()));	
		userManager.getAll();
		
		
		UserDto userDto=new UserDto("gulcanozel@gmail.com", "123456789");		
		authManager.login(userDto);
		
		
		UserDto userDto1=new UserDto("fgbnm", "12");
		authManager.login(userDto1);

	}

}
