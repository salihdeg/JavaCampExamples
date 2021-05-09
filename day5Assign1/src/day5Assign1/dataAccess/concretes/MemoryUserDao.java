package day5Assign1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5Assign1.dataAccess.abstracts.UserDao;
import day5Assign1.entities.concretes.User;

public class MemoryUserDao implements UserDao {

	private List<User> userList;

	public MemoryUserDao() {
		userList = new ArrayList<>();
	}

	@Override
	public void add(User user) {
		userList.add(user);
		System.out.println(user.getEmail() + " mail sahibi kullanýcý kaydedildi, onay bekliyor!");
	}

	@Override
	public void update(User user) {
		User userToUpdate = userList.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		if (userToUpdate != null) {
			userToUpdate.setEmail(user.getEmail());
			userToUpdate.setFirstName(user.getFirstName());
			userToUpdate.setLastName(user.getLastName());
			userToUpdate.setPassword(user.getPassword());
			System.out.println("Kullanýcý Güncellendi!");
		} else {
			System.out.println("Exception yok ama hata çok! => Ayrýca böyle bir kullanýcý yok!");
		}

	}

	@Override
	public void delete(User user) {
		User userToDelete = userList.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		userList.remove(userToDelete);
		System.out.println("Kullanýcý silindi!");

	}

	@Override
	public List<User> getAll() {

		return userList;
	}

	@Override
	public User getById(int id) {
		
		return userList.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
	}

	@Override
	public User getByEmail(String email) {
		
		return userList.stream().filter(u -> u.getEmail() == email).findFirst().orElse(null);
	}

}
