package day5Assign1.googleServices;

import java.util.ArrayList;
import java.util.List;

import day5Assign1.entities.concretes.User;

public class GoogleAuthManager {

	private List<User> googleUsers = new ArrayList<User>();

	public GoogleAuthManager() {
		User user1 = new User(1, "Salih", "Deðirmenci", "salihdegirmenci99@gmail.com", "123456");
		User user2 = new User(2, "Ebubekir", "Yazýcý", "ebubekiryazici@gmail.com", "456789");
		User user3 = new User(3, "Berkcan", "Balkaya", "berkcanbalkaya@gmail.com", "159753");
		googleUsers.add(user1);
		googleUsers.add(user2);
		googleUsers.add(user3);
	}

	public User login(String email, String password) {
		
		var findUser = googleUsers.stream().filter(u -> u.getEmail() == email).findFirst().orElse(null);
		
		if (findUser!=null) {
			if (findUser.getEmail() == email && findUser.getPassword() == password) {
				return findUser;
			}else {
				System.out.println("Þifre hatalý!");
				return null;
			}
		}else {
			System.out.println("Kullanýcý bulunamadý");
			return null;
		}
		
	}
}
