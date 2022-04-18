package homeWorkB;

public class NonReturnTypeWithParam {
    public void doSum(int num1, int num2){
        System.out.println("The total is: "+(num1+num2));
    }
    public void doSub(int num1, int num2){
        System.out.println("The result of the subtraction is: "+(num1-num2));
    }
    public void doMult(int num1, int num2){
        System.out.println("The result of the Multiplication is: "+(num1*num2));
    }
    public void doDiv(double num1, double num2){
        System.out.println("The result of division is: "+(num1/num2));
    }
    public void getName(String name){
        System.out.println("Name is: "+name);
    }

    public static void main(String[] args) {
      NonReturnTypeWithParam obj= new NonReturnTypeWithParam();
        obj.doSum(6,3);
        obj.doSub(52,4);
        obj.doMult(98,10);
        obj.doDiv(500,63);
        obj.getName("Elina");
    }
}
