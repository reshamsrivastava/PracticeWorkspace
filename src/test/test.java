package test;

import java.util.ArrayList;
import java.util.Comparator;

public class test {
	
	public static void main(String... args) {

	
	int A[][]= {{3,4,0,0},
				{7,4,0,0},
				{2,4,6,0},
				{8,5,9,3}};
	
	int res=solve(A);
	System.out.println("Result:"+res);
	
	}
	
	public static int solve(int[][] A) {
        int rows=A.length;
        int maxSum=A[0][0];
        int tempMax=0;
        for(int i=1;i<rows;i++)
        {
            tempMax=A[i][0];
            
            for (int j=1;j<=i;j++){    
                            
                if(tempMax<A[i][j]){
                    tempMax=A[i][j];
                } 
                 
            }
            System.out.println(tempMax);
            maxSum+=tempMax;
        }
        return maxSum;
    }

}
