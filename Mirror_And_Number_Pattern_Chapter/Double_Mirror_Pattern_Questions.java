package Mirror_And_Number_Pattern_Chapter;
import java.util.*;
public class Double_Mirror_Pattern_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int num=1;
        int nsp=n-1;
        int val=1;
        while(row<=2*n-1) {
        	// Space
        	int i=1;
        	while(i<=nsp) {
        		System.out.print("  ");
        		i++;
        	}
        	// Star
        	int j=1;
        	int p=val;
        	while(j<=num) {
        		System.out.print(p + " ");
        		if(j<=num/2) {
        			p++;        			
        		}else {
        			p--;
        		}
        		j++;
        	}
        	// Next row pre
        	// Mirror Concept
        	if(row<n) {
        		num=num+2;
        		nsp--;
        		val++;
        	}else {
        	num=num-2;
        	nsp++;
        	val--;
        	}
        	row++;
        	System.out.println();
        }
	}

}
