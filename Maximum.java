class Maximum{
	public static void main(String[] args){
		int[] array={23,24,12,16,2};
		int n=array.length;
		int max=array[0];
		for(int i=1;i<n;i++){
			if(max<array[i]){
				max=array[i];
			}
			
		}
		System.out.println(max);
	}
}