package homeWorkB;

public class ReturnTypeWithOutParam {

    public int doSum(){
        int num1=5;
        int num2=3;
        System.out.println("The total is: "+(num1+num2));
        return num1+num2;
    }
    public int doSub(){
        int num1=5;
        int num2=3;
        System.out.println("The result of the subtraction is: "+(num1-num2));
        return num1-num2;
    }
    public int doMult(){
        int num1=5;
        int num2=3;
        System.out.println("The result of the Multiplication is: "+(num1*num2));
        return num1*num2;
    }
    public double doDiv(){
        double num1=5;
        double num2=3;
        System.out.println("The result of division is: "+(num1/num2));
        return num1/num2;
    }
    public String getName(){
        String name="Melina";
        System.out.println("Name is: "+name);
        return name;
    }

    public static void main(String[] args) {
       ReturnTypeWithOutParam  obj= new ReturnTypeWithOutParam();
        obj.doSum();
        obj.doSub();
        obj.doMult();
        obj.doDiv();
        obj.getName();
    }
}
