package day5Assign1.core.utilities.business;

public class BusinessRules {
	
	public static boolean Run(boolean... logics ) {
		
		for (boolean logic : logics) {
			if (logic == false) {
				return logic;
			}
		}
		
		return true;
	}

}
