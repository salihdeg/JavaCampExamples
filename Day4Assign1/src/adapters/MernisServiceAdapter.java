package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap mernisValidation = new KPSPublicSoapProxy();
		//mernisValidation.TCKimlikNoDogrula(Long TC, AD, SOYAD, Do�um Y�l�);
		try {
			mernisValidation.TCKimlikNoDogrula(Long.parseLong("12345678900"), "Salih", "De�irmenci", 1999);
		} catch (Exception e) {
			
		}
		
		try {
			
			if (mernisValidation.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName(), customer.getLastName(), customer.getYearOfBirth())) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
}
