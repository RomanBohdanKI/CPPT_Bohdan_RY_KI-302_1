package KI302.Bohdan.Lab3;

import KI302.Bohdan.Lab3.MultiplyStarShip.StarShipColor;

public class MultiplyStarShipApp {
    public static void main(String[] args) {
        
        // Створюємо об'єкт зорельота з використанням конструктора за замовчуванням
        MultiplyStarShip myStarShip = new MultiplyStarShip();
        System.out.println(myStarShip.getStarShipName());
        System.out.println("Color: " + myStarShip.getStarShipColor());

        // Перевіряємо стан двигуна і пального
        System.out.println("Engine Wear: " + myStarShip.checkEngineWear());
        System.out.println("Fuel Level: " + myStarShip.checkFuel());

        // Заправляємо та ремонтуємо зореліт
        myStarShip.refuel();
        myStarShip.repair();

        // Перевіряємо стан після обслуговування
        System.out.println("Post-service Engine Wear: " + myStarShip.checkEngineWear());
        System.out.println("Post-service Fuel Level: " + myStarShip.checkFuel());
        
        // Створюємо новий зореліт з параметрами
        MultiplyStarShip customStarShip = new MultiplyStarShip("MotherShip", StarShipColor.YELLOW, 500, 50);
        System.out.println(customStarShip.getStarShipName());
        System.out.println("Color: " + customStarShip.getStarShipColor());

        // Перевіряємо стан нового зорельота
        System.out.println("Engine Wear: " + customStarShip.checkEngineWear());
        System.out.println("Fuel Level: " + customStarShip.checkFuel());

        // Заправляємо та ремонтуємо новий зореліт
        customStarShip.refuel();
        customStarShip.repair();
        
        // Перевіряємо стан нового зорельота після обслуговування
        System.out.println("Post-service Engine Wear: " + customStarShip.checkEngineWear());
        System.out.println("Post-service Fuel Level: " + customStarShip.checkFuel());
    }
}
