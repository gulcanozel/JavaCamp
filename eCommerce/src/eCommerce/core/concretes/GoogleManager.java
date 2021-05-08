package eCommerce.core.concretes;

import eCommerce.core.abstracts.GoogleEmailService;

public class GoogleManager implements GoogleEmailService{

	@Override
	public void send(String email, String message) {
		System.out.println("Email gönderildi");
		
	}

}
