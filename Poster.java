class Poster{
	
	double width;
	double length;
	String content;
	String material;
	String color;
	String shape;
	String title;
	int noOfPosters;
	boolean goodQuality;
	boolean goodLooking;
	
	
	
	public Poster(){
		
		System.out.println("Poster Details:");
	}
	
	public Poster(double width){
		
		this.width=width;
	}
	
	public Poster(double width, double length){
		
		this(width);
		this.length=length;
	}
	
	public Poster(double width, double length, String content){
		
		this(width,length);
		this.content=content;
	}
	
	public Poster(double width, double length, String content, String material){
		
		this(width,length,content);
		this.material=material;
	}
	public Poster(double width,double length,String content,String material,
	String color){
	
	    this(width,length,content,material);
		this.color=color;
    }
	
	public Poster(double width,double length,String content,String material,
	String color,String shape){
	
	    this(width,length,content,material,color);
		this.shape=shape;
    }
	
	public Poster(double width,double length,String content,String material,
	String color,String shape,String title){
	
	    this(width,length,content,material,color,shape);
		this.title=title;
    }
	
	public Poster(double width,double length,String content,String material,
	String color,String shape,String title,int noOfPosters){
	
	    this(width,length,content,material,color,shape,title);
		this.noOfPosters=noOfPosters;
    }
	
	public Poster(double width,double length,String content,String material,
	String color,String shape,String title,int noOfPosters,boolean goodQuality){
	
	    this(width,length,content,material,color,shape,title,noOfPosters);
		this.goodQuality=goodQuality;
    }
	
	public Poster(double width,double length,String content,String material,
	String color,String shape,String title,int noOfPosters,boolean goodQuality,
	boolean goodLooking){
	
	    this(width,length,content,material,color,shape,title,noOfPosters,goodQuality);
	    this.goodLooking=goodLooking;
	}
	public void info(){
		
		
	System.out.println("Poster Width:"+this.width);	
	System.out.println("Poster Length:"+this.length);
	System.out.println("Poster Content:"+this.content);
	System.out.println("Poster Material:"+this.material);
	System.out.println("Poster color:"+this.color);	
	System.out.println("Poster shape:"+this.shape);
	System.out.println("Poster title:"+this.title);
	System.out.println("Poster noOfPosters:"+this.noOfPosters);	
	System.out.println("Poster goodQuality:"+this.goodQuality);
	System.out.println("Poster goodLooking:"+this.goodLooking);	
		
		
	}
	
	
	
	
	
}