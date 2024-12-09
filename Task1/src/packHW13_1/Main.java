package packHW13_1;

public class Main {
    public static void main(String[] args) {

        ArithmeticCalculator calc = new ArithmeticCalculator(228, 52);
        calc.calculate(Operation.ADD);
        calc.calculate(Operation.SUBTRACT);
        calc.calculate(Operation.MULTIPLY);
        //calc.calculate(2288);
    }
}