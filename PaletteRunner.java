class PaletteRunner{
	
	
	public static void main(String[] args){
		
		Palette palette=new Palette();
        palette.info();
		
		Palette palette1=new Palette("EyeShade");
        palette1.info();
		
		Palette palette2=new Palette("EyeShade",4);
        palette2.info();
		
		Palette palette3=new Palette("EyeShade",4,"Black");
        palette3.info();
		
		Palette palette4=new Palette("EyeShade",4,"Black","Nykaa");
        palette4.info();
		
		Palette palette5=new Palette("EyeShade",4,"Black","Nykaa","Fiber");
        palette5.info();
		
		Palette palette6=new Palette("EyeShade",4,"Black","Nykaa","Fiber",false);
        palette6.info();
		
		Palette palette7=new Palette("EyeShade",4,"Black","Nykaa","Fiber",false,true);
        palette7.info();
		
		Palette palette8=new Palette("EyeShade",4,"Black","Nykaa","Fiber",false,true,1450);
        palette8.info();
		
		Palette palette9=new Palette("EyeShade",4,"Black","Nykaa","Fiber",false,true,1450,100);
        palette9.info();
		
		Palette palette10=new Palette("EyeShade",4,"Black","Nykaa","Fiber",false,true,1450,100,false);
        palette10.info();
	}
	
	
}