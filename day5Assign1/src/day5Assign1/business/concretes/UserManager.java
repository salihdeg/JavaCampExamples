package day5Assign1.business.concretes;

import java.util.List;

import day5Assign1.business.abstracts.UserService;
import day5Assign1.dataAccess.abstracts.UserDao;
import day5Assign1.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

}
