class TerraceRunner{
	public static void main(String[] args){
		
		Terrace terrace=new Terrace();
		
		System.out.println("Terrace Height:"+terrace.height);
		System.out.println("Terrace Area:"+terrace.area);
		System.out.println("Terrace Has_Roof:"+terrace.hasRoof);
		System.out.println("Terrace Temperature:"+terrace.temperature);
		
		terrace.height=10;
		terrace.area=250.5;
		terrace.hasRoof=true;
		terrace.temperature=29.5f;
		
		
		System.out.println("Terrace Height:"+terrace.height);
		System.out.println("Terrace Area:"+terrace.area);
		System.out.println("Terrace Has_Roof:"+terrace.hasRoof);
		System.out.println("Terrace Temperature:"+terrace.temperature);
		
		terrace.height=12;
		terrace.area=150.4;
		terrace.hasRoof=false;
		terrace.temperature=23.8f;
		
		
		System.out.println("Terrace Height:"+terrace.height);
		System.out.println("Terrace Area:"+terrace.area);
		System.out.println("Terrace Has_Roof:"+terrace.hasRoof);
		System.out.println("Terrace Temperature:"+terrace.temperature);
	}
}