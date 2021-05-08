package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.utils.useRegex;
import eCommerce.entities.concretes.User;
import eCommerce.entities.concretes.UserDto;

public class AuthManager implements AuthService{
	UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(userCheckIfNull(user)&&userExist(user.getEmail())&&checkfPassword(user.getPassword())
				&&useRegex.emailValidate(user.getEmail())) {
			userService.add(user);
		}
		else {
			System.out.println("Kayýt baþarýrýz.");
		}
		
	}

	private boolean userCheckIfNull(User user) {
		if(user!=null&&!user.getFirstName().isEmpty()&&!user.getLastName().isEmpty()
				&&!user.getEmail().isEmpty()&&!user.getPassword().isEmpty()) {
			return true;
		}
		System.out.println("Bu alan boþ býrakýlamaz.");
		return false;
	}

	@Override
	public void login(UserDto userDto) {
		User user=userService.getByEmail(userDto.getEmail());
		
		if(user!=null&&user.getPassword().equals(userDto.getPassword())&&loginNullControl(userDto)) {
			System.out.println("Giriþ yapýldý.");
		}
		else {
			System.out.println("Giriþ baþarýsýz.");
		}
		
	}

	private boolean loginNullControl(UserDto userDto) {
		if(!userDto.getEmail().isEmpty()&&!userDto.getPassword().isEmpty()) {
			return true;
		}
		System.out.println("Bu alan boþ býrakýlamaz.");
		return false;
	}

	@Override
	public boolean userExist(String email) {
		if(userService.getByEmail(email)!=null) {		
			System.out.println("User already exist");
			return false;
		}
		return true;
		
		
	}
	
	public boolean checkfPassword(String password) {
		if(password.length()<6) {
			
			System.out.println("Þifre 6 karakterden az olmamalý ! ");
			return false;
		}
		
		return true;
	}

}
