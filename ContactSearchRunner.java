class ContactSearchRunner{
	public static void main(String[] args){
		long num=ContactSearch.getMobileByEmail("mahalakshmiph@gmail.com");
		System.out.println(num);
		long num1=ContactSearch.getMobileByEmail("sharanyaph@gmail.com");
		System.out.println(num1);
		long num2=ContactSearch.getMobileByEmail("nalinaph@gmail.com");
		System.out.println(num2);
		long num3=ContactSearch.getMobileByEmail("harips@gmail.com");
		System.out.println(num3);
		long num4=ContactSearch.getMobileByEmail("saritha@gmail.com");
		System.out.println(num4);
		long num5=ContactSearch.getMobileByEmail("yajwin@gmail.com");
		System.out.println(num5);
		long num6=ContactSearch.getMobileByEmail("tanvi@gmail.com");
		System.out.println(num6);
		long num7=ContactSearch.getMobileByEmail("anvi@gmail.com");
		System.out.println(num7);
		long num8=ContactSearch.getMobileByEmail("mason@gmail.com");
		System.out.println(num8);
		long num9=ContactSearch.getMobileByEmail("riya@gmail.com");
		System.out.println(num9);
		long num10=ContactSearch.getMobileByEmail("mayur@gmail.com");
		System.out.println(num10);
		long num11=ContactSearch.getMobileByEmail("ashu@gmail.com");
		System.out.println(num11);
		long num12=ContactSearch.getMobileByEmail("sathi@gmail.com");
		System.out.println(num12);
		long num13=ContactSearch.getMobileByEmail("james@gmail.com");
		System.out.println(num13);
		long num14=ContactSearch.getMobileByEmail("battu@gmail.com");
		System.out.println(num14);
		long num15=ContactSearch.getMobileByEmail("mouni@gmail.com");
		System.out.println(num15);
		
		
		String name=ContactSearch.getEmailByName("Maha");
		System.out.println(name);
		String name1=ContactSearch.getEmailByName("Sharanya");
		System.out.println(name1);
		String name2=ContactSearch.getEmailByName("Nalina");
		System.out.println(name2);
		String name3=ContactSearch.getEmailByName("Hari");
		System.out.println(name3);
		String name4=ContactSearch.getEmailByName("Sree");
		System.out.println(name4);
		String name5=ContactSearch.getEmailByName("Ashrith");
		System.out.println(name5);
		String name6=ContactSearch.getEmailByName("Battu");
		System.out.println(name6);
		String name7=ContactSearch.getEmailByName("Mayur");
		System.out.println(name7);
		String name8=ContactSearch.getEmailByName("Tanvi");
		System.out.println(name8);
		String name9=ContactSearch.getEmailByName("Yajwin");
		System.out.println(name9);
		String name10=ContactSearch.getEmailByName("Saritha");
		System.out.println(name10);
		String name11=ContactSearch.getEmailByName("Mouni");
		System.out.println(name11);
		String name12=ContactSearch.getEmailByName("James");
		System.out.println(name12);
		String name13=ContactSearch.getEmailByName("Jeev");
		System.out.println(name13);
		String name14=ContactSearch.getEmailByName("Riya");
		System.out.println(name14);
		String name15=ContactSearch.getEmailByName("Teja");
		System.out.println(name15);
		
		String[] names=ContactSearch.searchByLastName("Kapoor");
		for(String nam:names){
			System.out.println(nam);
		}
		String[] names1=ContactSearch.searchByLastName("Sharma");
		for(String nam:names1){
			System.out.println(nam);
		}
		String[] names2=ContactSearch.searchByLastName("Shetty");
		for(String nam:names2){
			System.out.println(nam);
		}
		
	}
	
	
}