class TileRunner {
    public static void main(String[] args) {
        
        String type1 = "Floor"; 
		String material1 = "Porcelain"; 
		double length1 = 60; double width1 = 60; 
		double price1 = 20.5;
        Tile.details(type1, material1, length1, width1, price1);
        
        String type2 = "Wall"; 
		String material2 = "Ceramic"; 
		double length2 = 45; double width2 = 30; 
		double price2 = 15.0;
        Tile.details(type2, material2, length2, width2, price2);
        
        String type3 = "Roof"; 
		String material3 = "Clay"; 
		double length3 = 50; 
		double width3 = 50; 
		double price3 = 25.0;
        Tile.details(type3, material3, length3, width3, price3);
        
        String type4 = "Floor"; 
		String material4 = "Marble"; 
		double length4 = 80; 
		double width4 = 80; 
		double price4 = 50.0;
        Tile.details(type4, material4, length4, width4, price4);
        
        String type5 = "Wall"; 
		String material5 = "Granite"; 
		double length5 = 70; 
		double width5 = 40; 
		double price5 = 30.0;
        Tile.details(type5, material5, length5, width5, price5);
	}
}