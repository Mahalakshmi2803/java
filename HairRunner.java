class HairRunner{
	public static void main(String[] args){
		
		Hair hair=new Hair();
		
		System.out.println("Hair Style:"+hair.style);
		System.out.println("Hair Color:"+hair.color);
		System.out.println("Hair Length:"+hair.lengthInInches);
		System.out.println("Hair Type:"+hair.type);
		
		hair.style="French plate";
		hair.color="Black";
		hair.lengthInInches=12.2f;
		hair.type="Curly";
		
		
		System.out.println("Hair Style:"+hair.style);
		System.out.println("Hair Color:"+hair.color);
		System.out.println("Hair Length:"+hair.lengthInInches);
		System.out.println("Hair Type:"+hair.type);
		
		hair.style="Blunt";
		hair.color="Blonde";
		hair.lengthInInches=15;
		hair.type="Straight";
		
		
		System.out.println("Hair Style:"+hair.style);
		System.out.println("Hair Color:"+hair.color);
		System.out.println("Hair Length:"+hair.lengthInInches);
		System.out.println("Hair Type:"+hair.type);
	} 
}