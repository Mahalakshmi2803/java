class PosterRunner{
	
	public static void main(String[] args){
		
		
	Poster poster=new Poster();
    poster.info();
		
		
	Poster poster1=new Poster(21.3);	
	poster1.info();
		
		
	Poster poster2=new Poster(21.3,45.78);	
	poster2.info();
		
		
	Poster poster3=new Poster(21.3,45.78,"Advertisment of Joy Alukkas");	
	poster3.info();
		
		
	Poster poster4=new Poster(21.3,45.78,"Advertisment of Joy Alukkas","Paper");	
    poster4.info();	
		
	Poster poster5=new Poster(21.3,45.78,"Advertisment of Joy Alukkas","Paper","white");	
    poster5.info();
	
	Poster poster6=new Poster(21.3,45.78,"Advertisment of Joy Alukkas","Paper","white","rectangle");	
    poster6.info();
	
	Poster poster7=new Poster(21.3,45.78,"Advertisment of Joy Alukkas","Paper","white","rectangle","Advertisment");	
    poster7.info();
	
	Poster poster8=new Poster(21.3,45.78,"Advertisment of Joy Alukkas","Paper","white","rectangle","Advertisment",2);	
    poster8.info();
	
	Poster poster9=new Poster(21.3,45.78,"Advertisment of Joy Alukkas","Paper","white","rectangle","Advertisment",2,true);	
    poster9.info();
	
	Poster poster10=new Poster(21.3,45.78,"Advertisment of Joy Alukkas","Paper","white","rectangle","Advertisment",2,true,true);	
    poster10.info();
	}
	
}