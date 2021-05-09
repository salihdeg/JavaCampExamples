package day5Assign1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5Assign1.business.abstracts.AuthService;
import day5Assign1.business.abstracts.EmailService;
import day5Assign1.core.utilities.business.BusinessRules;
import day5Assign1.dataAccess.abstracts.UserDao;
import day5Assign1.entities.concretes.User;

public class AuthManager implements AuthService {
	private UserDao userDao;
	private EmailService emailService;
	private String specialToken = "7179231999";

	public AuthManager(UserDao userDao, EmailService emailService) {
		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public void register(User user) {
		if (user != null) {
			if (!BusinessRules.Run(checkAllFields(user), checkPassword(user), checkEmailFormat(user),
					checkEmailExist(user), checkName(user))) {
				return;
			}
			userDao.add(user);
			emailService.send(specialToken);

		} else {
			System.out.println("Hatal� Kullan�c�");
		}

	}

	@Override
	public void login(String email, String password) {
		var user = userDao.getByEmail(email);
		if (user != null) {
			if (user.getPassword() == password) {
				System.out.println("Giri� Ba�ar�l�!");
			}
		} else {
			System.out.println("Bu mail ile kullan�c� bulunamad�!");
		}
	}

	@Override
	public void verifyUser(User user, String tokenString) {

		var isUser = userDao.getById(user.getId());
		if (isUser != null) {
			if (tokenString == specialToken) {
				isUser.setValid(true);
				System.out.println("Hesab�n�z onayland�!");
			}
			
		}

	}

	@Override
	public void update(User user) {
		if (!BusinessRules.Run(checkAllFields(user), checkPassword(user), checkEmailFormat(user), checkEmailExist(user),
				checkName(user))) {
			System.out.println("Hatal� Bilgiler Girdiniz!");
			return;
		}

		userDao.update(user);

	}

	@Override
	public void delete(User user) {

		userDao.delete(user);

	}

	// Business Rules
	private boolean checkAllFields(User user) {
		if (user == null || user.getEmail().isEmpty() || user.getFirstName().isEmpty() || user.getLastName().isEmpty()
				|| user.getPassword().isEmpty()) {
			System.out.println("Alanlar bo� olamaz!");
			return false;
		} else {
			return true;
		}
	}

	private boolean checkPassword(User user) {
		if (user.getPassword().length() >= 6) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkEmailFormat(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		return matcher.matches();
	}

	private boolean checkEmailExist(User user) {
		if (userDao.getByEmail(user.getEmail()) != null) {
			System.out.println("Bu email mevcut!");
			return false;
		} else {
			return true;
		}
	}

	private boolean checkName(User user) {
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		if (firstName.length() < 2 || lastName.length() < 2) {
			System.out.println("Ad�n�z ve ya soyad�n�z en az iki harf olmal�!");
			return false;
		} else {
			return true;
		}
	}

}
