package business;

import abstracts.CustomerCheckService;
import entities.Customer;

public class MernisFakeManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		int nationalityIdLength = customer.getNationalityId().length();
		if (nationalityIdLength==11) {
			return true;
		}
		
		return false;
		
	}

}
