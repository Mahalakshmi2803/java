class FloorRunner{
	public static void main(String[] args){
	Floor floor=new Floor();
	
	System.out.println("Floor color:"+floor.color);
	System.out.println("Floor Design:"+floor.Design);
	System.out.println("Floor Floor_Number:"+floor.floorNo);
	System.out.println("Floor Area:"+floor.area);
	
	floor.color="White";
	floor.Design="Plain";
	floor.floorNo=2;
	floor.area=108.8;
	
	System.out.println("Floor color:"+floor.color);
	System.out.println("Floor Design:"+floor.Design);
	System.out.println("Floor Floor_Number:"+floor.floorNo);
	System.out.println("Floor Area:"+floor.area);
	
	floor.color="Cream";
	floor.Design="Print";
	floor.floorNo=1;
	floor.area=200.3;
	
	System.out.println("Floor color:"+floor.color);
	System.out.println("Floor Design:"+floor.Design);
	System.out.println("Floor Floor_Number:"+floor.floorNo);
	System.out.println("Floor Area:"+floor.area);
	}	
}