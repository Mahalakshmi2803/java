class SambarRunner{
	public static void main(String... args){
		String[] ref= Sambar.vegetables();
		for(String vegg:ref){
		System.out.println(vegg);	
		}
		int ree=Sambar.quantity();
		System.out.println(ree);
		boolean refs=Sambar.IsHot();
		System.out.println(refs);
		boolean reff=Sambar.IsGood();
		System.out.println(reff);
	}
}