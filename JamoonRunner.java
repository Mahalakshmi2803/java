class JamoonRunner{
	public static void main(String[] args){
		Jamoon jamoon=new Jamoon();
		
		System.out.println("Jammon Taste is good:"+jamoon.tasteIsGood);
		System.out.println("Jammon cost:"+jamoon.Cost);
		System.out.println("Jammon Shape:"+jamoon.shape);
		System.out.println("Jammon grams:"+jamoon.grams);
		
		jamoon.tasteIsGood=true;
		jamoon.Cost=50;
		jamoon.shape="Round";
		jamoon.grams=100;
		
		System.out.println("Jammon Taste is good:"+jamoon.tasteIsGood);
		System.out.println("Jammon cost:"+jamoon.cost);
		System.out.println("Jammon Shape:"+jamoon.shape);
		System.out.println("Jammon grams:"+jamoon.grams);

		
		jamoon.tasteIsGood=false;
		jamoon.Cost=25;
		jamoon.shape="Oval";
		jamoon.grams=50;
		
		System.out.println("Jamoon Taste is good:"+jamoon.tasteIsGood);
		System.out.println("Jamoon cost:"+jamoon.Cost);
		System.out.println("Jamoon Shape:"+jamoon.shape);
		System.out.println("Jamoon grams:"+jamoon.grams);
	}
}