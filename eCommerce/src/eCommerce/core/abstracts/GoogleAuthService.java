package eCommerce.core.abstracts;

import eCommerce.entities.concretes.UserDto;

public interface GoogleAuthService {

	void register(String email);
	void login(UserDto userDto);
	void userExists(String email);

}
