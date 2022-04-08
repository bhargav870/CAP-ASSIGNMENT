package first.java;

public class Assignment1Q8 {

	  public int[] bubbleSort(int arr[]) {
		  int n =arr.length;
		  for(int i=0;i<n;i++) {   
			  for(int j=0;j<n-1;j++) {
 //here basically we are creating making two loops.for 1 array  1 we are sorting and keeping into it
// and other for checking if j=0 is greater than second number or not
// in this if statement we are checking and if j is greater than next number we are keeeping it in t then
//	updating that greater number in j+1 place 
// and that j+1 small number in that T where j was saved
				  if (arr[j]>arr[j+1]){
					  int t=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=t;
	           		      
				                      }
			                        }
		                         }   
		return arr;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1Q8 obj = new Assignment1Q8();
		 int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		 int sortedarr[]=obj.bubbleSort(arr);
		 for(int i:sortedarr) {
			 System.out.print(i+" ");
			 
		 }
	}
}

