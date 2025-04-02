class Palette {

    String type;
    int no_of_Slots;
    String color;
    String Brand;
    String material;
    boolean reusable;
    boolean canMixColors;
    boolean foldable;
    int cost;
    double eachSlotHolds;

    public Palette() {
        System.out.println("Palette Details:");
    }

    public Palette(String type) {
       
        this.type = type;
    }

    public Palette(String type, int no_of_Slots) {
        this(type);
        this.no_of_Slots = no_of_Slots;
    }

    public Palette(String type, int no_of_Slots, String color) {
        this(type, no_of_Slots);
        this.color = color;
    }

    public Palette(String type, int no_of_Slots, String color, String Brand) {
        this(type, no_of_Slots, color);
        this.Brand = Brand;
    }

    public Palette(String type, int no_of_Slots, String color, String Brand, String material) {
        this(type, no_of_Slots, color, Brand);
        this.material = material;
    }

    public Palette(String type, int no_of_Slots, String color, String Brand, String material, boolean reusable) {
        this(type, no_of_Slots, color, Brand, material);
        this.reusable = reusable;
    }

    public Palette(String type, int no_of_Slots, String color, String Brand, String material, boolean reusable, boolean foldable) {
        this(type, no_of_Slots, color, Brand, material, reusable);
        this.foldable = foldable;
    }

    public Palette(String type, int no_of_Slots, String color, String Brand, String material, boolean reusable, boolean foldable, int cost) {
        this(type, no_of_Slots, color, Brand, material, reusable, foldable);
        this.cost = cost;
    }

    public Palette(String type, int no_of_Slots, String color, String Brand, String material, boolean reusable, boolean foldable, int cost, double eachSlotHolds) {
        this(type, no_of_Slots, color, Brand, material, reusable, foldable, cost);
        this.eachSlotHolds = eachSlotHolds;
    }

    public Palette(String type, int no_of_Slots, String color, String Brand, String material, boolean reusable, boolean foldable, int cost, double eachSlotHolds, boolean canMixColors) {
        this(type, no_of_Slots, color, Brand, material, reusable, foldable, cost, eachSlotHolds);
        this.canMixColors = canMixColors;
    }
	
	
	public void info(){
		
		
	System.out.println("Poster type:"+this.type);	
	System.out.println("Poster no_of_Slots:"+this.no_of_Slots);
	System.out.println("Poster color:"+this.color);
	System.out.println("Poster Brand:"+this.Brand);
	System.out.println("Poster material:"+this.material);	
	System.out.println("Poster reusable:"+this.reusable);
	System.out.println("Poster foldable:"+this.foldable);
	System.out.println("Poster cost:"+this.cost);
	System.out.println("Poster eachSlotHolds:"+this.eachSlotHolds);
	System.out.println("Poster canMixColors:"+this.canMixColors);		
		
		
		
	}
}
