import java.util.*;
class MatrixMultiplication{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns of 1st matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter rows and columns of 2nd matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        if(r1!=c2)
        {
            System.out.println("Matrix multiplication not possible as order of the matrices does not match");
            System.exit(0);
        }
        else
        {
             System.out.println("Enter"+(r1*c1)+"elements into 1st matrix");
             for(int i=0;i<r1;i++)
             {
                 for(int j=0;j<c1;j++)
                 {
                     a[i][j]=sc.nextInt();
                 }
             }
             System.out.println("Enter"+(r2*c2)+"elements into 2nd matrix");
             for(int i=0;i<r2;i++)
             {
                 for(int j=0;j<c2;j++)
                 {
                     b[i][j]=sc.nextInt();
                 }
             }
             int c[][]=new int[r1][c2];
             for(int i=0;i<r1;i++)
             {
                 for(int j=0;j<c1;j++)
                 {
                     for(int k=0;k<c2;k++)
                     {
                        c[i][k]=c[i][k]+a[i][j]*b[j][k];
                     }
                 }
             }
              System.out.println("After multiplication of two matrices the matrix is: ");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        } 
             
    }
}
