package lab6;

public class LinkedList<T extends Numbers> {
    Node<T> head;

    static class Node<T extends Numbers> {
        T data;
        Node<T> next;

        Node(T d) {
            data = d;
            next = null;
        }
    }

    public void insert(T data) {
        Node<T> new_node = new Node<T>(data);
        new_node.next = null;

        if (this.head == null) {
            this.head = new_node;
        } else {
            Node<T> last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printList() {
        Node<T> currNode = this.head;

        System.out.print("LinkedList: \n");

        while (currNode != null) {
            System.out.print(" ");
            currNode.data.PrintInfo();
            currNode = currNode.next;
        }
    }

    public T FindMax() { // метод для пошуку максимального об'єкта
        if (this.head == null) {
            return null; // повертаємо null, якщо список пустий
        }

        Node<T> maxNode = this.head;
        Node<T> currNode = this.head.next;

        while (currNode != null) {
            if (currNode.data.getDecValue() > maxNode.data.getDecValue()) {
                maxNode = currNode; // оновлюємо maxNode, якщо знайшли більший
            }
            currNode = currNode.next;
        }
        return maxNode.data; // повертаємо максимальний елемент
    }
}