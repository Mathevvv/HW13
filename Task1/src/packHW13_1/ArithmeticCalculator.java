package packHW13_1;

public class ArithmeticCalculator {

    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation act) {
        if (act==Operation.ADD) System.out.println(a+b);
        else if (act==Operation.SUBTRACT) System.out.println(a-b);
        else if (act == Operation.MULTIPLY) System.out.println(a*b);
        else System.out.println("Неверное значение");
    }
}


