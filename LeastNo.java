class LeastNo{
	public static void main(String[] args){
		int[] arr={2,4,6,1,3};
		int least=arr[0];
		int Secleast=arr[1];
		if(Secleast<least){
			int temp=least;
			least=Secleast;
			Secleast=temp;
		}
		for(int i=2;i<arr.length;i++){
			if(least>arr[i]){
				least=arr[i];
			}
		}
		System.out.print(least);
	}
}