package Adapters;

import java.rmi.RemoteException;


import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public abstract class MernisServiceAdapter implements CustomerCheckService {


	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException{
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=client.TCKimlikNoDogrula(
				
				Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth()
				
				);
		
		
		return result;
	}

}