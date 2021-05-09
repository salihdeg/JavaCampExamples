package day5Assign1.business.abstracts;

import day5Assign1.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void login(String email, String password);
	void verifyUser(User user,String tokenString);
	void update(User user);
	void delete(User user);
}
