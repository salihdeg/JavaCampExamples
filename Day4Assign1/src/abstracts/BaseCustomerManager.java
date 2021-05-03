package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	public void save(Customer customer) {
		System.out.
		println(customer.getFirstName() + " " + customer.getLastName() + " Veritabanýna Kaydedildi!");
		
	}

}
