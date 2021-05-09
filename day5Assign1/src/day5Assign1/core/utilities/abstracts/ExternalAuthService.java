package day5Assign1.core.utilities.abstracts;

import day5Assign1.entities.concretes.User;

public interface ExternalAuthService {
	User login(String email, String password);
}
