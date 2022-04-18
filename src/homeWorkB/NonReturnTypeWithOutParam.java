package homeWorkB;

public class NonReturnTypeWithOutParam {

    public void doSum(){
        int num1=5;
        int num2=3;
        System.out.println("The total is: "+(num1+num2));
    }
    public void doSub(){
        int num1=5;
        int num2=3;
        System.out.println("The result of the subtraction is: "+(num1-num2));
    }
    public void doMult(){
        int num1=5;
        int num2=3;
        System.out.println("The result of the Multiplication is: "+(num1*num2));
    }
    public void doDiv(){
        double num1=5;
        double num2=3;
        System.out.println("The result of division is: "+(num1/num2));
    }
    public void getName(){
       String name="Maya";
        System.out.println("Name is: "+name);
    }

    public static void main(String[] args) {
     NonReturnTypeWithOutParam obj= new NonReturnTypeWithOutParam();
     obj.doSum();
     obj.doSub();
     obj.doMult();
     obj.doDiv();
     obj.getName();
    }
}
