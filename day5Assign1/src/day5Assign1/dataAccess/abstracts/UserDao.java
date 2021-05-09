package day5Assign1.dataAccess.abstracts;

import java.util.List;

import day5Assign1.entities.concretes.User;

public interface UserDao {

	void add(User user);

	void update(User user);

	void delete(User user);

	List<User> getAll();

	User getById(int id);

	User getByEmail(String email);

}
