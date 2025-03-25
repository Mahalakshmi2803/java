class EvenOdd{
    public static void main(String[] args){
		int[] numbers={1,2,3,4,5,6,7};
		int even=0;
		int odd=0;
		for(int index=0;index<numbers.length;index++){
			if(numbers[index]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Even:"+even);
		System.out.println("Odd:"+odd);
		
	}
}