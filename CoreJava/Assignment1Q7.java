package first.java;

public class Assignment1Q7 {

	  public boolean searchArray(int[] arr,int toCheckValue){
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]==toCheckValue) {
				System.out.println(toCheckValue);
			  }
		  }
		   return false;
	  }
      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	  Assignment1Q7 obj = new Assignment1Q7();
    	  int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    	  obj.searchArray(arr,23);
    	  	}
}