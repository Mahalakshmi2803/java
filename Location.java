class Location{
	public static void main(String[] args){
		String location1="Bangalore";
		String location2="Mysuru";
		String location3="Chitradurga";
		String location4="Tumkuru";
		String location5="Kolar";
		String location6="Gulbarga";
		String location7="Hubli";
		String location8="Davanagere";
		String location9="Chikmangluru";
		String location10="Hassan";
		
		String[] locations={location1,location2,location3,location4,location5,location6,location7,location8,location9,location10};
		
		System.out.println("1st location is:"+locations[0]);
        System.out.println("2nd location is:"+locations[1]);
		System.out.println("3rd location is:"+locations[2]);
		System.out.println("4th location is:"+locations[3]);
		System.out.println("5th location is:"+locations[4]);
		System.out.println("6th location is:"+locations[5]);
		System.out.println("7th location is:"+locations[6]);
		System.out.println("8th location is:"+locations[7]);
		System.out.println("9th location is:"+locations[8]);
		System.out.println("10th location is:"+locations[9]);
		
		locations[1]="Manglore";
		locations[3]="shimmoga";
		
		System.out.println("\nUpdated locations");
        System.out.println("2nd location is:" + locations[1]);
        System.out.println("4th location is:" + locations[3]);

	}
}