package day5Assign1.core.utilities;

import day5Assign1.core.utilities.abstracts.ExternalAuthService;
import day5Assign1.entities.concretes.User;
import day5Assign1.googleServices.GoogleAuthManager;

public class GoogleAuthAdapter implements ExternalAuthService {

	@Override
	public User login(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		return googleAuthManager.login(email, password);
	}

}
