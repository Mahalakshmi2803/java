class AnchorRunner{
	public static void main(String[] args){
		Anchor anchor=new Anchor();
		
		System.out.println("Anchor Type:"+anchor.type);
		System.out.println("Anchor Density:"+anchor.density);
		System.out.println("Anchor Weight:"+anchor.weight);
		System.out.println("Anchor Length:"+anchor.length);
		
		anchor.type="Bruce";
		anchor.density=7.8f;
		anchor.weight=50;
		anchor.length=1.5;
		
		System.out.println("Anchor Type:"+anchor.type);
		System.out.println("Anchor Density:"+anchor.density);
		System.out.println("Anchor Weight:"+anchor.weight);
		System.out.println("Anchor Length:"+anchor.length);
		
		anchor.type="Pool";
		anchor.density=9.8f;
		anchor.weight=55;
		anchor.length=2.5;
		
		System.out.println("Anchor Type:"+anchor.type);
		System.out.println("Anchor Density:"+anchor.density);
		System.out.println("Anchor Weight:"+anchor.weight);
		System.out.println("Anchor Length:"+anchor.length);
	}
}