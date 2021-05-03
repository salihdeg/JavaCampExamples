package business;

import abstracts.SaleService;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class SaleManager implements SaleService {

	@Override
	public void sellGame(Customer customer, Game game) {
		String adSoyad = customer.getFirstName() + " " + customer.getLastName();
		double price = game.getPrice();
		String gameName = game.getName();
		System.out.println(adSoyad + " Adl� kullan�c� �u oyunu ald� -> " + gameName + " Fiyat�: " + price + "$");

	}

	@Override
	public void sellGame(Customer customer, Game game, Campaign campaign) {
		String adSoyad = customer.getFirstName() + " " + customer.getLastName();
		double price = game.getPrice() - ((game.getPrice() * campaign.getDiscountRate()) / 100);
		String gameName = game.getName();
		String campaignName = campaign.getName();
		System.out.println(adSoyad +
				" Adl� kullan�c� �u oyunu ald� -> " + gameName + ",\n " + campaignName + 
				" Adl� kampanya uyguland�\t�lk Fiyat�: " + game.getPrice() + " �ndirimli Fiyat�: " + price + "$");

	}

}
