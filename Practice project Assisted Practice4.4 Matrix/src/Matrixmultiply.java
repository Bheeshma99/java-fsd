
public class Matrixmultiply {
	public static void  multyply(int a[][],int b[][],int r1,int c2,int c1)
	{
		int ans[][]=new int [r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
				{
					ans[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("produc of two matrix:");
		for(int row[]:ans)
		{
			for(int column : row)
			{
				System.out.print(column+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args)
	{
		int a[][]= {{ 1,3 ,7},{4,8,9}};
		int b[][]= {{2,9},{3,8},{5,7}};
		int r1=a.length;
		int c1=a[0].length;
		int r2=b.length;
		int c2=b[0].length;

		multyply(a,b,r1,c2,c1);
				
	
	}
}
