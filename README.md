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





# Ordenamiento de un arreglo de mayor a menor y de menor a mayor 
# usando el metodo de burbuja

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
# El factorial de un numero

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main f = new Main();
        f.fibo();
        
        
    }
    
    public void fibo(){
        int num=4;
        int temp =1;
        
        for (int i = 1; i<=num ; i++){
            temp = i * temp;
        }
        System.out.println("el factorial de "+ num +" es: "+temp);
        
    }
}
# Numero fibonacci
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int a=0;
        int b=1;
        int res =1;
        
        for(int i =0;i<=10;i++){
            b = res;
            res = a+b;
            a=b;
            System.out.println("el numero fibonacci es "+ res +" posicion: "+ (i+2) );
            
            
        }
    }
}

# Suma de numeros del 1-100

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int res=0;
        
        for(int i =1;i<=100;i++){
            
            res = i+res;
            System.out.println("suma de numeros de 1-100: "  + "numero de iteracion: " + i + " " +res  );
            
            
        }
    }
}
# 6 Hacer un algoritmo que imprima los números impares desde el 100 hasta la unidad y que calcule su suma
## suma de numeros impares del 100 al 1
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
     
     int num = 100;
     int res=0;
        
        while(num >=1){
            
            if ((num%2) != 0){
                System.out.println("numero impar" + num);
               res +=num;
              
                
            }
            num--;
               //System.out.println("la suma total es:paso 2 " + res);
        }
        System.out.println("la suma total es  2  : " + res);
        
     
    }
}
# Hacer un algoritmo que imprima todos los números naturales que hay desde la unidad hasta un número introducido   por teclado
~~~
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int num1= 58;
        int res =0;
        
        
        while(num1 >= 0){
            
            res +=num1;
            num1--;
            
        }
        System.out.println("la suma de los numeros naturales es " + res);
        
        
    }
}
~~~
# multiplos de 3
~~~
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
     int num1 = 36;
     while (num1 >=0){
        if((num1%3) == 0){
             System.out.println("numeros multiplos de 3:"+ num1);
        }
        
         num1--;
     }
    }
    }
~~~
# multipos de 5 y suma de los multiplos de 1-500
~~~
import java.util.*;

public class Main {
        int num1 =0;
        int num2= 0;
    public static void main(String[] args) throws Exception {
        //Hacer un algoritmo que imprima y cuente los múltiplos de 5

        //que hay entre 1 y 500
        Main m1 = new Main();
        m1.multiplos();
        
        
        
    }
    
    
    public void multiplos(){
        for(int i =1; i<=500;i++){
            
            if( (i%5) == 0 ){
                num2 = num2 + i;
                num1++;
            }
        }
        System.out.println("total multiplos de 5: " + num1 + "suma total de esos numeros multiplos: " + num2);
        
    }
}
~~~


# como hacer un link de un ejecutable en ubuntu 
## ejemplo

ejecutable en ubuntu --->  sudo gedit /usr/share/applications/nombreprograma.desktop

[Desktop Entry]
Name=Nombre del programa
Comment=Comentario sobre el programa
Exec=/home/usuario/carpetaPrograma/bin/programa.sh
Icon=/home/usuario/Images/iconoPrograma
Terminal=false
Type=Application


ejemplo:

[Desktop Entry]
Name=Android Studio
Comment=IDE Android Studio
Exec=/home/javierlight/Android-Studio-IDE/bin/studio.sh
Icon=/home/usuario/Imagenes/Iconos/androidstudio.png
Terminal=false
Type=Application
