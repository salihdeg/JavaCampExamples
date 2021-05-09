package day5Assign1.business.concretes;

import day5Assign1.business.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send(String tokenString) {
		
		System.out.println("Mesaj gönderildi, Token: " + tokenString);
		
	}
	
}
