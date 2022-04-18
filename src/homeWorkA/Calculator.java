package homeWorkA;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("***Let's do some additions***");
        System.out.print("Please enter a number then hit enter: ");
        int number1= input.nextInt();
        System.out.print("Please enter another number: ");
        int number2= input.nextInt();
        System.out.println(number1+"+"+number2+"= "+(number1+number2));
        System.out.println("***The result of the multiplication is***");
        System.out.println(number1+"*"+number2+"= "+(number1*number2));
        System.out.println("***The result of the division is***");
        System.out.printf(number1+"/"+number2+"= %.2f",(double)((double)number1/(double)number2));


    }
}
