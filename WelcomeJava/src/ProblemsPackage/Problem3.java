package ProblemsPackage;

public class Problem3 {
    public static void main(String[] args) {
        BasicMathematicalOperation operation = new BasicMathematicalOperation();
        operation.addition(12,34);
        operation.subtraction(15, 16);
    }

}
class BasicMathematicalOperation{
    // To create a method for addition
    public void addition ( int a, int b){
        System.out.println("The result is " + (a + b));
    }

    // To create a method for subtraction
    public void subtraction ( int a, int b){
        if (a > b) {
            System.out.println("The result is "+(a - b));
        } else {
            System.out.println("The result is "+(b - a));
        }
    }

    // To create a method for multiplication
    public void multiplication ( int a, int b){
        System.out.println("The result is "+(a * b));
    }
}
