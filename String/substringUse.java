import java.io.*;
import java.util.*;

public class substringUse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int asize=0;
        int bsize=0;
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0;i<A.length();i++){
                asize++;
        }
        for(int i=0;i<B.length();i++){
             bsize++;   
        }
        System.out.println(asize+bsize);
        if(A.compareTo(B)>0){
                
        System.out.println("Yes");
        }else{
        System.out.println("No");
                
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+" "+B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());
        
        
    }
}



