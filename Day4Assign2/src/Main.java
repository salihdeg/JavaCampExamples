import business.CampaignManager;
import business.CustomerManager;
import business.GameManager;
import business.MernisFakeManager;
import business.SaleManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class Main {

	public static void main(String[] args) {

		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		CustomerManager customerManager = new CustomerManager(new MernisFakeManager());
		SaleManager saleManager = new SaleManager();

		Customer oyuncu = new Customer(1, "Salih", "Değirmenci", "11111111111", 1999);
		Game cyberpunk = new Game(1, "Cyberpunk 2077", 60);
		Game batman = new Game(2, "Batman Arkham Knight", 70);
		Campaign campaign = new Campaign(1, "İlk Satın alım indirimi!", 10);

		gameManager.add(cyberpunk);

		campaignManager.add(campaign);

		customerManager.add(oyuncu);

		saleManager.sellGame(oyuncu, batman, campaign);

		saleManager.sellGame(oyuncu, cyberpunk);

	}

}
