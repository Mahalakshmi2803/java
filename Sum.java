class ArraySum{
	public static void main(String[] args){
		int sum=0;
		int[] arr={1,2,3,4,5};
		for(int no:arr){
			sum += no;
		}
		System.out.println("Sum is: "+sum);
	}
}