class CabSearch{
	public static int getCostBySourceAndDestination(String source,String destination){
		if(source=="Bangalore"&&destination=="Delhi"){
			int cost=10000;
			return cost;
		}
		else if(source=="Bangalore"&&destination=="Kolkata"){
			int cost1=11000;
			return cost1;
		}
		else if(source=="Delhi"&&destination=="Kolkata"){
			int cost2=12000;
			return cost2;
		}
		else if(source=="Chennai"&&destination=="Kolkata"){
			int cost3=13000;
			return cost3;
		}
		else if(source=="Bangalore"&&destination=="Chennai"){
			int cost4=14000;
			return cost4;
		}
		else if(source=="Chennai"&&destination=="Delhi"){
			int cost5=15000;
			return cost5;
		}
		else if(source=="Jharkand"&&destination=="Kolkata"){
			int cost6=16000;
			return cost6;
		}
		else if(source=="Bangalore"&&destination=="Jharkand"){
			int cost7=17000;
			return cost7;
		}
		else if(source=="Jharkand"&&destination=="Delhi"){
			int cost8=18000;
			return cost8;
		}
		else if(source=="Jharkand"&&destination=="Chennai"){
			int cost9=19000;
			return cost9;
		}
		else if(source=="Jharkand"&&destination=="Varanasi"){
			int cost10=2000;
			return cost10;
		}
		else if(source=="Varanasi"&&destination=="Chennai"){
			int cost11=21000;
			return cost11;
		}
		else{
			System.out.println("There is no source and destination");
			return 0;
		
		}
	}
	
	public static int getDistanceBySourceAndDestination(String source,String destination){
		if(source=="Bangalore"&&destination=="Delhi"){
			int distance=2130;
			return distance;
		}
		else if(source=="Bangalore"&&destination=="Kolkata"){
			int distance1=1874;
			return distance1;
		}
		else if(source=="Delhi"&&destination=="Kolkata"){
			int distance2=1471;
			return distance2;
		}
		else if(source=="Chennai"&&destination=="Kolkata"){
			int distance3=1667;
			return distance3;
		}
		else if(source=="Bangalore"&&destination=="Chennai"){
			int distance4=325;
			return distance4;
		}
		else if(source=="Chennai"&&destination=="Delhi"){
			int distance5=2333;
			return distance5;
		}
		else if(source=="Jharkand"&&destination=="Kolkata"){
			int distance6=450;
			return distance6;
		}
		else if(source=="Bangalore"&&destination=="Jharkand"){
			int distance7=2011;
			return distance7;
		}
		else if(source=="Jharkand"&&destination=="Delhi"){
			int distance8=1320;
			return distance8;
		}
		else if(source=="Jharkand"&&destination=="Chennai"){
			int distance9=1807;
			return distance9;
		}
		else if(source=="Jharkand"&&destination=="Varanasi"){
			int distance10=437;
			return distance10;
		}
		else if(source=="Varanasi"&&destination=="Chennai"){
			int distance11=1853;
			return distance11;
		}
		else if(source=="Kashmir"&&destination=="Kolkata"){
			int distance12=2153;
			return distance12;
		}
		else if(source=="Kashmir"&&destination=="varanasi"){
			int distance13=1481;
			return distance13;
		}
		else if(source=="Chennai"&&destination=="Goa"){
			int distance14=887;
			return distance14;
		}
		else if(source=="Pondicherry"&&destination=="Chennai"){
			int distance15=165;
			return distance15;
		}
		else if(source=="Chennai"&&destination=="Kashmir"){
			int distance16=3046;
			return distance16;
		}
		else if(source=="Goa"&&destination=="Kolkata"){
			int distance17=2145;
			return distance17;
		}
		else if(source=="Bangalore"&&destination=="Ayodhya"){
			int distance18=1896;
			return distance18;
		}
		else if(source=="Ayodhya"&&destination=="Delhi"){
			int distance19=693;
			return distance19;
		}
		else if(source=="Ayodhya"&&destination=="Chennai"){
			int distance20=1541;
			return distance20;
		}
		else if(source=="Goa"&&destination=="Varanasi"){
			int distance21=1450;
			return distance21;
		}
		else if(source=="Prayagraj"&& destination=="Chennai"){
			int distance22=1763;
			return distance22;
		}
		else{
			System.out.println("There is no source and destination");
			return 0;
		
		}
	
	}
	public static void searchAvailability(String destination){
		if (destination == "Bangalore") {
        boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Goa"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Chennai"){
		boolean availability= true;
		System.out.println(availability);
		
	}
	else if(destination=="Pondicherry"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Kolkata"){
		boolean availability= false;
		System.out.println(availability);
		
	}
	else if(destination=="Tumkur"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Hassan"){
		boolean availability= true;
		System.out.println(availability);
		
	}
	else if(destination=="Hubli"){
		boolean availability= false;
		System.out.println(availability);
	}
	else if(destination=="Dharwad"){
		boolean availability= true;
		System.out.println(availability);
		
	}
	else if(destination=="Vijaywada"){
		boolean availability= false;
		System.out.println(availability);
	}
	else if(destination=="Vizag"){
		boolean availability= true;
		System.out.println(availability);
		
	}
	else if(destination=="Chittor"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Bijapur"){
		boolean availability= false;
		System.out.println(availability);
		
	}
	else if(destination=="Mulki"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Davangere"){
		boolean availability= false;
		System.out.println(availability);
		
	}
	else if(destination=="Dudsagar"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Varanasi"){
		boolean availability= false;
		System.out.println(availability);
		
	}
	else if(destination=="Jammu"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Durga"){
		boolean availability= false;
		System.out.println(availability);
		
	}
	else if(destination=="gadag"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Mangalore"){
		boolean availability= true;
		System.out.println(availability);
		
	}
	else if(destination=="Mumbai"){
		boolean availability= false;
		System.out.println(availability);
	}
	else if(destination=="Pune"){
		boolean availability= false;
		System.out.println(availability);
		
	}
	else if(destination=="Kerala"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Kashmir"){
		boolean availability= false;
		System.out.println(availability);
		
	}
	else if(destination=="Jharkand"){
		boolean availability= true;
		System.out.println(availability);
	}
	else if(destination=="Prayagraj"){
		boolean availability= false;
		System.out.println(availability);
		
	}
	}
}