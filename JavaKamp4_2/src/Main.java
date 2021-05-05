import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Adapters.MernisServiceAdapter;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException{
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("GÜLCAN");
		customer.setLastName("ÖZEL");
		customer.setDateOfBirth(1999);
		customer.setNationalityId("22411396480");
		

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter() {
		});
		customerManager.Save(customer);
	}
}