package homeWorkA;

import java.util.Scanner;

public class Calculator2 {


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
        Scanner input2= new Scanner(System.in);
       Calculator2 cal= new Calculator2();
       System.out.print("Please enter a selection:\nEnter 'A' for 'Addition'\nEnter 'S' for 'Subtraction'\nEnter 'M' for 'Multiplication'\nEnter 'D' for 'Division'\n==>" );
       String typeOfOperation= input2.next();
       if(typeOfOperation.equals("A")){
           cal.doAddition();
       }else{
           if(typeOfOperation.equals("S")){
               cal.doSubtraction();
           }else{
               if(typeOfOperation.equals("M")) {
                   cal.doMultiplication();
               }else{
                   if(typeOfOperation.equals("D")) {
                       cal.doDivision();
                   }else{
                       System.out.println("Please insert the correct selection!!!");
                   }
               }

           }
       }

    }
}
