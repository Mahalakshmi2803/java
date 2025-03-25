public class Cricket{
	public static void cricketDetails(String dayName,String... playerNames ){
		for(String name:playerNames){
			System.out.println("Match day:"+dayName);
			System.out.println("Name of the player:"+name);
			
		}
		
	}
    public static void cricketDetails(String[] playerName,int noOfMatches,int totalRuns ){
		for(String name:playerName){
			int Average=totalRuns/noOfMatches;
			System.out.println("Name of the player:"+name);
			System.out.println("Avg Score:"+Average);
			
		}
		
	}	
	public static void cricketDetails(String[] playerName,int[] noOfMatches,int[] Score){
		for(String name:playerName){
			System.out.println("Name of the player:"+name);
	}
	    for(int matches:noOfMatches){
			System.out.println("Number of matches:"+matches);
	}
	    for(int score:Score){
			System.out.println("score of matches:"+score);
	}
	    for(int index=0;index<3;index++){
		   int avg=Score[index]/noOfMatches[index];
			System.out.println("avg of matches:"+avg);
	}
}
}