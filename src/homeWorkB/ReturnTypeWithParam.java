package homeWorkB;

public class ReturnTypeWithParam {

    public int doSum(int num1, int num2, int num3){
        System.out.println("The total is: "+(num1+num2+num3));
        return num1+num2+num3;
    }
    public int doSub(int num1, int num2){
        System.out.println("The result of the subtraction is: "+(num1-num2));
        return num1-num2;
    }
    public boolean rainingToday(boolean trueOrFalse){
      if(trueOrFalse==true){
          System.out.println("Yes it's raining today");
      }else{
          System.out.println("No, it's not raining today");
      }
    return trueOrFalse;
    }
    public int doMult(int num1, int num2){
        System.out.println("The result of the multiplication is: "+(num1*num2));
        return num1*num2;
    }
    public String getInfo(String name, String lName, int age){
        System.out.println("Name is: "+name+" Last name is: "+lName+" age is: "+age);
        return name;
    }

    public static void main(String[] args) {
        ReturnTypeWithParam obj= new ReturnTypeWithParam();
        obj.getInfo("Yani","lYani",6);
        obj.rainingToday(false);
        obj.doSum(5,6,3);
        obj.doSub(8,3);
        obj.doMult(89,1000000);
    }
}
