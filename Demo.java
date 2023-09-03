    public class Demo {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int calcRes = calculator.add(5,3);
        System.out.println(calcRes);
        System.out.println("hello world");
    }
}

/**
 * Calculator
 */
class Calculator {

    int a;
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}