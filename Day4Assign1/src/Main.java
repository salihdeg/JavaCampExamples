import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer salih = new Customer(1, "Salih", "Deðirmenci", 1999, "00000000000");

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(salih);

	}

}
