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
			System.out.println(adSoyad + " Adlý Müþteri Eklendi!");
		} else {
			System.out.println("Hatalý Kullanýcý!");
		}

	}

	@Override
	public void delete(Customer customer) {
		String adSoyad = customer.getFirstName() + " " + customer.getLastName();
		System.out.println(adSoyad + " Adlý Müþteri Silindi!");

	}

	@Override
	public void update(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			String adSoyad = customer.getFirstName() + " " + customer.getLastName();
			System.out.println(adSoyad + " Adlý Müþteri Güncellendi!");
		} else {
			System.out.println("Hatalý Kullanýcý!");
		}
	}

}
