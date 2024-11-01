package lab5;

import java.io.*;
import java.util.Scanner;

public class CalculateTheEquation implements CalculateTheEquationInterface, ReadWriteData {
    private double variable = 0;

    @Override
    public double doCalculation() {
        // Перевірка на нуль перед обчисленням
        if (variable == 0) {
            System.out.println("Cotangent is undefined for x = " + variable);
            return Double.NaN; // Повертаємо NaN, щоб позначити невизначене значення
        }
        
        // Обчислюємо котангенс
        variable = 1 / Math.tan(variable);
        return variable;
    }

    @Override
    public void writeResultToTxt(String fileName) throws IOException {
        PrintWriter f = new PrintWriter(fileName);
        f.printf("%f ", variable);
        f.close();
    }

    @Override
    public void writeResultToBin(String fileName) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fileName));
        f.writeDouble(variable);
        f.close();
    }

    @Override
    public void readResultFromTxt(String fileName) throws IOException {
        File f = new File(fileName);
        if (f.exists()) {
            Scanner scanner = new Scanner(f);
            variable = scanner.nextDouble();
            System.out.println("Read value from txt: " + variable);
            scanner.close();
        } else {
            throw new IOException("File " + fileName + " not found");
        }
    }

    @Override
    public void readResultFromBin(String fileName) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fileName));
        variable = f.readDouble();
        System.out.println("Read value from bin: " + variable);
        f.close();
    }
}

