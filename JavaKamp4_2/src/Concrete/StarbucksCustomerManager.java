package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws RemoteException{
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db :" + customer.getFirstName());
			super.Save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}


}
