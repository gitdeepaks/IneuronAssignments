package Assignment1;

public class Question5 {
    public static void main(String[] args) {
        int n=20;
		int i;
        int j;
		for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if (j==0 && i<=(n-1)/2 || i==0 && j<=(n-1)/2 || i+j<=(n-1)/2 || i == n-1 || j==0 || i==0 || i-j>=(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    
}

    