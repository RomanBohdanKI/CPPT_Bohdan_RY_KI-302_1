package lab6;

public class Main {
    public static void main(String[] args) {
        LinkedList<Numbers> list = new LinkedList<>();

        // Додаємо елементи до списку
        list.insert(new HexNumbers("14D", 333));
        list.insert(new BinaryNumbers("1 0110 0100 0011", 5699));
        list.insert(new HexNumbers("593A", 22842));
        list.insert(new HexNumbers("19BD", 6589));
        list.insert(new BinaryNumbers("11 1101 1000", 984));
        list.insert(new HexNumbers("E2F4", 58100));
        list.insert(new BinaryNumbers("11 0101 1000", 856));
        list.insert(new BinaryNumbers("10 0101 0111", 599));
        list.insert(new HexNumbers("15C1", 5569));
        list.insert(new BinaryNumbers("10 1001 1101", 669));
        System.out.println("Binary Numbers:");
        
        LinkedList.Node<Numbers> currentNode = list.head;
        while (currentNode != null) {
        if (currentNode.data instanceof BinaryNumbers) {
        currentNode.data.PrintInfo();
            }
            currentNode = currentNode.next;
        }
        // Виводимо список
        list.printList();

        // Знаходимо максимальний елемент
        Numbers maxElement = list.FindMax();
        if (maxElement != null) {
            System.out.print("Max element: ");
            maxElement.PrintInfo();
        } else {
            System.out.println("List is empty, no max element.");
        }
    }
}