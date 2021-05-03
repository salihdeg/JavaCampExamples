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
		System.out.println(adSoyad + " Adlý kullanýcý þu oyunu aldý -> " + gameName + " Fiyatý: " + price + "$");

	}

	@Override
	public void sellGame(Customer customer, Game game, Campaign campaign) {
		String adSoyad = customer.getFirstName() + " " + customer.getLastName();
		double price = game.getPrice() - ((game.getPrice() * campaign.getDiscountRate()) / 100);
		String gameName = game.getName();
		String campaignName = campaign.getName();
		System.out.println(adSoyad +
				" Adlý kullanýcý þu oyunu aldý -> " + gameName + ",\n " + campaignName + 
				" Adlý kampanya uygulandý\tÝlk Fiyatý: " + game.getPrice() + " Ýndirimli Fiyatý: " + price + "$");

	}

}
