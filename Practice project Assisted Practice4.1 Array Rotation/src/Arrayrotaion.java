import java.util.Scanner;

public class Arrayrotaion {
      public static void rightroted(int arr[],int n,int k)
      {
    	 if(k>0&&k<=n) 
    	 {
    		 for(int j=0;j<k;j++)
    		 {
    			 int last=arr[n-1];
    			 for(int i=n-2;i>=0;i--)
    				 arr[i+1]=arr[i];
    			 arr[0]=last;
    		 }
    	 }
      }
	public static void main(String[] args) {
	  int arr[]= {1,2,5,8,9,10,51,27,36};
	  System.out.println("values of array before rotation.");
	  for(int value: arr)
	  {
		  System.out.print(value);
		  System.out.print('\t');
	  }
	 System.out.println(" ");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the right rotation value:");
	  int k=sc.nextInt();
	  int n=arr.length;
      rightroted(arr,n,k);
      System.out.println("values of array after "+k+" right rotation.");
	  for(int value: arr)
	  {
		  System.out.print(value);
		  System.out.print('\t');
	  }
	}

}
