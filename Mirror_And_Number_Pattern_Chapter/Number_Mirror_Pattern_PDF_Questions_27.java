package Mirror_And_Number_Pattern_Chapter;
import java.util.*;
public class Number_Mirror_Pattern_PDF_Questions_27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int row=1;
        int num=1;
        int nsp=n-1;
        while(row<=n) {
        	// Space
        	int i=1;
        	while(i<=nsp) {
        		System.out.print("  ");
        		i++;
        	}
        	// Nums
        	int j=1;
        	int val=1;
        	while(j<=num) {
        		System.out.print(val +" ");
        		if(j<=num/2) { 
        			val++;
        		}else {
        			val--;
        		}
        		j++;
        	}
        	// Next Row Pre
        	nsp--;
        	num=num+2;
        	// Go next row
        	row++;
        	System.out.println();
        }
	}

}
