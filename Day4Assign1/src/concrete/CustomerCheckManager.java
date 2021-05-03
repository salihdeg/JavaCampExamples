package concrete;

import abstracts.CustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
