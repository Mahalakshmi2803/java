class Scope{
	public static void main(String[] args){
		{
			int number=8;
			number=9;
			{
				number=3;
				System.out.println(number);
			}
			number=6;
				System.out.println(number);
		}
	}
}