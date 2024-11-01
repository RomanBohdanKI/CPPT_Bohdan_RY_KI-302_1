package KI302.Bohdan.Lab3;

// Інтерфейси для контролю зносу двигуна та пального
interface EngineWearControlInterface {
    double checkEngineWear();
}

interface FuelControlInterface {
    double checkFuel();
}

public class MultiplyStarShip implements EngineWearControlInterface, FuelControlInterface {
    // Поля даних
    private String starShipName;
    private double engineWear;
    private double fuel;
    private StarShipColor starShipColor;
    private static int starShipCount = 0; // Змінена назва змінної для ясності

    // Конструктори
    public MultiplyStarShip() {
        starShipName = "MultiplyStarShip";
        starShipColor = StarShipColor.YELLOW;
        fuel = 234.0;
        engineWear = 145.0;
        starShipCount++;
    }

    public MultiplyStarShip(String starShipName) {
        this.starShipName = starShipName;
        starShipColor = StarShipColor.RED;
        fuel = 1000.0;
        engineWear = 1000.0;
        starShipCount++;
    }

    public MultiplyStarShip(String starShipName, StarShipColor starShipColor) {
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        fuel = 1000.0;
        engineWear = 1000.0;
        starShipCount++;
    }

    public MultiplyStarShip(String starShipName, StarShipColor starShipColor, double fuel) {
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        this.fuel = fuel;
        engineWear = 1000.0;
        starShipCount++;
    }

    public MultiplyStarShip(String starShipName, StarShipColor starShipColor, double fuel, double engineWear) {
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        this.fuel = fuel;
        this.engineWear = engineWear;
        starShipCount++;
    }

    // Перелічення для кольору зорельота
    public enum StarShipColor {
        WHITE, BLACK, RED, PINK, YELLOW, GREEN, BLUE
    }

    // Геттери
    public String getStarShipName() {
        return "#" + starShipCount + " " + starShipName;
    }

    public double getFuel() {
        return fuel;
    }

    public double getEngineWear() {
        return engineWear;
    }

    public StarShipColor getStarShipColor() {
        return starShipColor;
    }

    // Реалізація методів інтерфейсів
    @Override
    public double checkFuel() {
        fuel -= 0.100;
        if (fuel < 0) {
            System.out.println("The starship has no fuel");
            return 0;
        }
        return fuel;
    }

    @Override
    public double checkEngineWear() {
        engineWear -= 0.100;
        if (engineWear < 0) {
            System.out.println("The starship's engine is worn out");
            return 0;
        }
        return engineWear;
    }

    // Метод для заправки
    public void refuel() {
        if (fuel == 1000.0) {
            System.out.println("The starship is already full.");
        } else {
            System.out.println("Fuel was reloaded.");
            fuel = 1000.0;
        }
    }

    // Метод для ремонту
    public void repair() {
        if (engineWear == 1000.0) {
            System.out.println("The engine is already in perfect condition.");
        } else {
            System.out.println("The engine was repaired.");
            engineWear = 1000.0;
        }
    }
}
