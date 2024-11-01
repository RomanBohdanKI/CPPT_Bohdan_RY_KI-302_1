package lab5;

import java.io.IOException;

public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquation calc = new CalculateTheEquation();
        
        try {
            // Читання з бінарного файлу
            calc.readResultFromBin("src/bin.bin");
            double result = calc.doCalculation();
            System.out.println("Result of calculation from bin: " + result);
            calc.writeResultToBin("src/bin.bin");
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            // Читання з текстового файлу
            calc.readResultFromTxt("src/txt.txt");
            double result = calc.doCalculation();
            System.out.println("Result of calculation from txt: " + result);
            calc.writeResultToTxt("src/txt.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
