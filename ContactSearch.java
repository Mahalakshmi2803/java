class ContactSearch {
    
    public static long getMobileByEmail(String email) {
        System.out.println("Searching contact for email: " + email);

          
          if (email=="mahalakshmiph@gmail.com") {
			long num =9876543210L;
            return num;
		  }
		  
           else if (email== "sharanyaph@gmail.com") {
			long num1 =8765432109L;
            return num1;
		 }
		  
         else if (email== "harips@gmail.com") {
			long num2 =7654321098L;
            return num2;
		 }
		  
         else if (email=="nalinaph.com") {
			long num3 =6543210987L;
            return num3;
		 }
		  
         else if (email=="saritha@gmail.com") {
			 long num4 =7472109876L;
            return num4;
		 }
		  
         else if (email=="ashu@gmail.com") {
			 long num5 =8321098765L;
            return num5;
		 }
		  
         else if (email=="mason@gmail.com") {
			long num6 =9210987654L;
            return num6;
		 }
		  
         else if (email=="mouni@gmail.com") {
			 long num7 =7109876543L;
            return num7;
		 }
		  
         else if (email=="james@gmail.com") {
			 long num8 =9098765432L;
            return num8;
		 }
		  
         else if (email=="sathi@gmail.com") {
			 long num9 =8987654321L;
            return num9; 
		 }
		  
         else if (email=="tanvi@gmail.com") {
			 long num10 =8765432109L;
            return num10;
		 }
		  
         else if (email=="mayur@gmail.com") {
			 long num11 =9654321098L;
            return num11;
		 }
		  
         else if (email=="riya@gmail.com") {
			 long num12 =8543210987L;
            return num12;
		 }
		  
         else if (email=="battu@gmail.com") {
			 long num13 =6432109876L;
            return num13; 
		 }
         
         else if (email=="yajwin@gmail.com") {
			 long num14 =7876543210L;
            return num14;
		} 
		else {
            System.out.println("Contact not found!");
            return 0; 
        }
    }
	public static String getEmailByName(String name){
		System.out.println("Searching names for email:"+name);
		
		if(name=="Maha"){
			String emailid1="mahalakshmiph@gmail.com";
			return emailid1;
		}
		else if(name=="Sharanya"){
			String emailid2="sharanyaph@gmail.com";
			return emailid2;
		}
		else if(name=="Nalina"){
			String emailid3="nalinaph@gmail.com";
			return emailid3;
		}
		else if(name=="Hari"){
			String emailid4="harips@gmail.com";
			return emailid4;
		}
		else if(name=="Ashrith"){
			String emailid5="ashu@gmail.com";
			return emailid5;
		}
		else if(name=="Battu"){
			String emailid6="battu@gmail.com";
			return emailid6;
		}
		else if(name=="Mouni"){
			String emailid7="mouni@gmail.com";
			return emailid7;
		}
		else if(name=="Riya"){
			String emailid8="riya@gmail.com";
			return emailid8;
		}
		else if(name=="Tanvi"){
			String emailid9="tanvi@gmail.com";
			return emailid9;
		}
		else if(name=="Yajwin"){
			String emailid10="yajwin@gmail.com";
			return emailid10;
		}
		else if(name=="Sathi"){
			String emailid11="sathi@gmail.com";
			return emailid11;
		}
		else if(name=="Saritha"){
			String emailid12="saritha@gmail.com";
			return emailid12;
		}
		else if(name=="Mayur"){
			String emailid13="mayur@gmail.com";
			return emailid13;
		}
		else if(name=="James"){
			String emailid14="james@gmail.com";
			return emailid14;
		}
		else if(name=="Sree"){
			String emailid15="sree@gmail.com";
			return emailid15;
		}
		else{
			System.out.println("No name found:");
		}
		
	return name;
	}
	
	
	public static String[] searchByLastName(String name){
		String[] names={"Raha Kapoor","Ektha Kapoor","Rishi Kapoor","Alia Kapoor",
		"Riya Kapoor","Rohith Sharma","Ruhi Sharma","Anushka Sharma","Kapil Sharma","Sneha Sharma",
		"Shilpa Shetty","Soundarya Shetty","Sunil Shetty","Ahan Shetty","Atiya Shetty"};
		String[] arr={"","","","",""};
		int j=0;
		
		for(int i=0;i<names.length;i++){
			if(names[i].endsWith(name)){
				arr[j]= names[i];
				j++;
			}
		}
		return arr;
	}
	
}

    