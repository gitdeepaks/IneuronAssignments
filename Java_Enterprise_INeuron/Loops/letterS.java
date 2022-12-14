package Loops;

public class letterS {
    public static void main(String[] args) {
        int n=20;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
                //if(i==0 && j!=0 || i==(n-1) && j!=(n-1) || i==(n-1)/2 && j!=0 && j!=(n-1) || (i<=(n-1)/2 && j==0 && i!=0 && i!=(n-1)/2) || (i>(n-1)/2 &&j==(n-1)) && j!=(n-1)/2 && i!=(n-1)/2 && i!=(n-1))
				//if(i==j || i+j==(n-1) || i==0 || j==0 || i==(n-1) || j==(n-1) || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n+(n-1)/2)
				if(j==0 && i<=(n-1)/2 || i==0 && j<=(n-1)/2 || i+j<=(n-1)/2 || j-i >=(n-1)/2 || i-j>=(n-1)/2 || i+j>=n-1 +n/2)
				System.out.print("x");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
    }
    
}
