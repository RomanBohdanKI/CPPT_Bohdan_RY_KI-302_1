package KI302.Bohdan.Lab4;
public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println("  y=ctg(x)  = " + calc.doCalculation(300));
        System.out.println("  y=ctg(x)   = " + calc.doCalculation(70));
        System.out.println("  y=ctg(x)   = " + calc.doCalculation(-4444));

        System.out.println("  y=ctg(x)    = " + calc.doCalculationWithInputInside());
    }
}
