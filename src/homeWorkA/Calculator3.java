package homeWorkA;

import java.util.Scanner;

public class Calculator3 {
    public void doAddition(){
        int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.println("+++We will do some additions+++");
        System.out.println("Please insert the first number: ");
        a=input.nextInt();
        System.out.println("Please insert the second number: ");
        b= input.nextInt();
        System.out.println("Please insert the third number: ");
        c= input.nextInt();
        System.out.println(a+"+"+b+"+"+c+"= "+(a+b+c));

    }
    public void doSubtraction(){
        int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.println("---We will do some subtractions---");
        System.out.println("Please insert the first number: ");
        a=input.nextInt();
        System.out.println("Please insert the second number: ");
        b= input.nextInt();
        System.out.println("Please insert the third number: ");
        c= input.nextInt();
        System.out.println(a+"-"+b+"-"+c+"= "+(a-b-c));

    }
    public void doMultiplication(){
        int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.println("***We will do some multiplications***");
        System.out.println("Please insert the first number: ");
        a=input.nextInt();
        System.out.println("Please insert the second number: ");
        b= input.nextInt();
        System.out.println("Please insert the third number: ");
        c= input.nextInt();
        System.out.println(a+"*"+b+"*"+c+"= "+(a*b*c));

    }
    public void doDivision(){
        double a,b;
        Scanner input= new Scanner(System.in);
        System.out.println("///We will do some divisions///");
        System.out.println("Please insert the first number: ");
        a=input.nextInt();
        System.out.println("Please insert the second number: ");
        b= input.nextInt();
        System.out.println(a+"/"+b+"= "+(a/b));

    }

    public static void main(String[] args) {
        Calculator3 cal3= new Calculator3();
        cal3.doAddition();
        cal3.doSubtraction();
        cal3.doMultiplication();
        cal3.doDivision();
    }

}
