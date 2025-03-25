class If{
	public static void main(String[] args){
	int number=3;
	if(number<4)
	{
		System.out.println("number is true");
	}
	else
	{
		System.out.println("number is not true");
    
    }
} 
}

class IfElse{
	public static void main(String[] args){
	int number=3;
	if(number<3)
	{
		System.out.println("number is less than given number");
	}
	else if (number>3)
	{
		System.out.println("number is greater than given number");
    
    }
	else
	{
		System.out.println("number is equal to given number");
    
    }
} 
}


class While{
	public static void main(String[] args){
		int count=1;
		while(count<=5){
			System.out.println("count:"+count);
			count++;
			System.out.println("loop finished");
		}
	}
}


class For{
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}

class Switch{
	public static void main(String[] args){
		int day=2;
		
		switch(day){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
		}
		
	}
}