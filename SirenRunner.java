class SirenRunner{
	public static void main(String[] args){
		
		Siren siren=new Siren();
		
		System.out.println("Siren Volume:"+siren.volume);
		System.out.println("Siren Frequency:"+siren.frequency);
		System.out.println("Siren IsOn:"+siren.isOn);
		System.out.println("Siren Duration:"+siren.durationInMinutes);
		
		siren.volume=85;
		siren.frequency=1200.5;
		siren.isOn=true;
		siren.durationInMinutes=2.5f;
		
		
		System.out.println("Siren Volume:"+siren.volume);
		System.out.println("Siren Frequency:"+siren.frequency);
		System.out.println("Siren IsOn:"+siren.isOn);
		System.out.println("Siren Duration:"+siren.durationInMinutes);
		
		siren.volume=90;
		siren.frequency=1080.9;
		siren.isOn=false;
		siren.durationInMinutes=3.8f;
		
		
		System.out.println("Siren Volume:"+siren.volume);
		System.out.println("Siren Frequency:"+siren.frequency);
		System.out.println("Siren IsOn:"+siren.isOn);
		System.out.println("Siren Duration:"+siren.durationInMinutes);
		
		
	}
}