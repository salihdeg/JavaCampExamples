package business;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {

		if (customerCheckService.checkIfRealPerson(customer)) {
			String adSoyad = customer.getFirstName() + " " + customer.getLastName();
			System.out.println(adSoyad + " Adl� M��teri Eklendi!");
		} else {
			System.out.println("Hatal� Kullan�c�!");
		}

	}

	@Override
	public void delete(Customer customer) {
		String adSoyad = customer.getFirstName() + " " + customer.getLastName();
		System.out.println(adSoyad + " Adl� M��teri Silindi!");

	}

	@Override
	public void update(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			String adSoyad = customer.getFirstName() + " " + customer.getLastName();
			System.out.println(adSoyad + " Adl� M��teri G�ncellendi!");
		} else {
			System.out.println("Hatal� Kullan�c�!");
		}
	}

}
