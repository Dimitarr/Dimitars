package calculator;

import java.io.IOException;
import java.util.Scanner;



public class Calculator {

       public static void main(String[] args) throws IOException {
        Scanner inp= new Scanner(System.in);
        int a, b,r, choise ;
         do {
        System.out.println("Введіть перше число");
        a = inp.nextInt();        
        System.out.println("Введіть друге число");
        b = inp.nextInt();           
        System.out.println("Введіть бажану дію над цифрами : "
                + "\n 1.Додавання "
                + "\n 2.Віднімання "
                + "\n 3.Множення "
                + "\n 4.Ділення "
                + "\n 5.Цілочисельне ділення "
                + "\n 6.Вихід з програми");
       
        choise = inp.nextInt();
        switch (choise) {
            case 1:
                r = a + b;
                System.out.println("Ваш результат " + r);
                break;
            case 2:
                r = a - b;
                System.out.println("Ваш результат " + r);
                break;
            case 3:
                r = a * b;
                System.out.println("Ваш результат " + r);
                break;
            case 4:
                r = a / b;
                System.out.println("Ваш результат " + r);
                break;
            case 5:
                r = a % b;
                System.out.println("Ваш результат " + r);
                break;
                    }
        }while (choise=='6');
              }
               }
      
       
                 
       
        