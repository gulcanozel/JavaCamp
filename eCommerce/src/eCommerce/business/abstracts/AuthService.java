package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;
import eCommerce.entities.concretes.UserDto;

public interface AuthService {
	void register(User user);
	void login(UserDto userDto);
	boolean userExist(String email);
}
