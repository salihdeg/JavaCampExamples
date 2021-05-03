package abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Game;

public interface SaleService {
	void sellGame(Customer customer, Game game);
	void sellGame(Customer customer, Game game, Campaign campaign);
}
