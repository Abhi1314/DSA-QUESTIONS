public class reverse_array
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {1, 2, 3};
		int start=0;
		int end=arr.length-1;
		while(start<end){
		    int temp=arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--;
		}
		for (int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " ");
 	        }
	}
}
