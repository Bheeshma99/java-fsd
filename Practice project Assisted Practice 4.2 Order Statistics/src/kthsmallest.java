import java.util.Scanner;

public class kthsmallest {

	public static int  ksmallestnumber(int arr[],int n,int k)
	{
		int j;
		for( j=0;j<k;j++)
		 {     int min=j;
			 for(int i=j+1;i<n;i++)
			 {
				 if(arr[i]<arr[min])
					 min=i;
			 }
	         int temp=arr[j];
	         arr[j]=arr[min];
	         arr[min]=temp;
		 }
		 return arr[j-1];
	}
	
	public static void main(String[] args) {
		 int arr[]= {1,2,5,8,9,10,51,27,36};
		  System.out.println("values of array:");
		  for(int value: arr)
		  {
			  System.out.print(value);
			  System.out.print('\t');
		  }
		 System.out.println(" ");
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the value of k:");
		  int k=sc.nextInt();
		  int n=arr.length;
         
          System.out.println(k+"th smallest value:"+ ksmallestnumber(arr,n,k));

	}

}
