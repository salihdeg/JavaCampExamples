package abstracts;

import entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
}
