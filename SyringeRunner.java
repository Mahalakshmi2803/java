class SyringeRunner{
	public static void main(String[] args){
		int quantity1=10;
		String medicineName1="abc";
		String nurseName1="cde";
		boolean injected1=true;
		Syringe.details(quantity1,medicineName1,nurseName1);
		Syringe.inject(injected1);
		
		int quantity2=12;
		String medicineName2="aaa";
		String nurseName2="eee";
		boolean injected2=false;
		Syringe.details(quantity2,medicineName2,nurseName2);
		Syringe.inject(injected2);
		
		int quantity3=14;
		String medicineName3="aba";
		String nurseName3="ede";
		boolean injected3=true;
		Syringe.details(quantity3,medicineName3,nurseName3);
		Syringe.inject(injected3);
		
		int quantity4=16;
		String medicineName4="aca";
		String nurseName4="ece";
		boolean injected4=false;
		Syringe.details(quantity4,medicineName4,nurseName4);
		Syringe.inject(injected4);
		
		int quantity5=18;
		String medicineName5="aea";
		String nurseName5="eae";
		boolean injected5=true;
		Syringe.details(quantity5,medicineName5,nurseName5);
		Syringe.inject(injected5);
	}
}