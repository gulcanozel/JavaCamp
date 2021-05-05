package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	@Override
	public void Save(Customer customer) throws RemoteException {
		
		super.Save(customer);
	}
}
