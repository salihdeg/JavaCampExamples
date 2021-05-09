package day5Assign1;

import day5Assign1.business.concretes.AuthManager;
import day5Assign1.business.concretes.EmailManager;
import day5Assign1.business.concretes.UserManager;
import day5Assign1.core.utilities.GoogleAuthAdapter;
import day5Assign1.core.utilities.abstracts.ExternalAuthService;
import day5Assign1.dataAccess.concretes.MemoryUserDao;
import day5Assign1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User salih = new User(1, "Salih", "Deðirmenci", "salihdegirmenci99@gmail.com", "123456");
		AuthManager authManager = new AuthManager(new MemoryUserDao(), new EmailManager());
		ExternalAuthService externalAuthService = new GoogleAuthAdapter();
		
		authManager.register(externalAuthService.login("salihdegirmenci99@gmail.com", "123456")); // With Adapter
		// if we try again, we'll see an error
		authManager.register(externalAuthService.login("salihdegirmenci99@gmail.com", "123456")); // With Adapter
		
		//authManager.register(salih); // Without Adapter
		authManager.verifyUser(salih, "7179231999");
		authManager.login("salihdegirmenci99@gmail.com", "123456");
	}

}
