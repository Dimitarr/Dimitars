
package myprog;
import java.util.Scanner;

class form {
     int a,b,result;
     
         
     
     int funcform1 (int a, int b) {
     result = a+b;
     return result;
     
     
     }
}



public class Myprog {
    public static void main(String[] args) {
       int n,r,f;
       Scanner inp=new Scanner (System.in);
       System.out.println("Введите первое число");
       n= inp.nextInt();
       System.out.println("Введите второе число");
       r= inp.nextInt();
       form form1= new form();
       f=form1.funcform1(n,r);
       System.out.println("Ваш результат " + f);
    }
}
