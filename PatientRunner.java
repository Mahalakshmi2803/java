class PatientRunner{
	public static void main(String[] args){
	Patient patient=new Patient();
	
	System.out.println("Patient Name:"+patient.name);
	System.out.println("Patient Age:"+patient.age);
	System.out.println("Patient Disease:"+patient.disease);
	System.out.println("Patient Duration in hours:"+patient.durationInHours);
	
	patient.name="Riya";
	patient.age=21;
	patient.disease="Fever";
	patient.durationInHours=32.5;
	
	System.out.println("Patient Name:"+patient.name);
	System.out.println("Patient Age:"+patient.age);
	System.out.println("Patient Disease:"+patient.disease);
	System.out.println("Patient Duration in hours:"+patient.durationInHours);
	
	patient.name="Ram";
	patient.age=18;
	patient.disease="Cough";
	patient.durationInHours=60;
	
	
	System.out.println("Patient Name:"+patient.name);
	System.out.println("Patient Age:"+patient.age);
	System.out.println("Patient Disease:"+patient.disease);
	System.out.println("Patient Duration in hours:"+patient.durationInHours);
  }
   }