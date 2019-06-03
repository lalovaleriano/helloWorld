# Temario Junit (tutorial)

1. How to Download and Installation JUnit
2. Tutorial	JUnit Test framework
3. Tutorial	JUnit Annotations & API
4. Tutorial	Junit Assert
5. Tutorial	Create JUnit Test Suite
6. Tutorial	JUnit Ignore Test
7. Tutorial	JUnit Exception Test
8. Tutorial	JUnit ErrorCollector
9. Tutorial	JUnit Parameterized Test



import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main orden1 = new Main();
        orden1.ordena1();
        orden1.ordena2();
    }
    
    public void ordena1(){
        int [] a = {8,5,4,10,3,2,1,4};
        int temp;
        
        for(int i =0;i<=8;i++){
            for(int j =0;j<8-1 ;j++){
                
                if( a[j] > a[j+1] ){
                    
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }
        
        for(int h=0;h<=7;h++){
            System.out.print( a[h]+ " "  );
        }
        System.out.println("");

}
    public void ordena2(){
        int [] b = {8,5,4,10,3,2,1,4};
        int tem;
        
        
        for(int a =0; a<8; a++){
            for (int e=0; e<8-1;e++){
                if ( b[e] < b[e+1] ){
                    tem = b[e];
                    b[e] = b[e+1];
                    b[e+1] = tem;
                    
                }
                
            }
        }
    for ( int q =0; q< 8;q++){
        System.out.print( b[q] + " "  );
        
    }
    System.out.println("");
    }

}

