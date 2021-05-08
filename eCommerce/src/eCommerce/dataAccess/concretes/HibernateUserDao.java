package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getFirstName());
		users.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullanýcý silindi: " + user.getFirstName());
		
	}

	@Override
	public User getByEmailAndPassword(String email,String password) {
		for(User user:users) {
			if(user.getEmail() == email)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for(User user : users) {
			if(user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}


}
