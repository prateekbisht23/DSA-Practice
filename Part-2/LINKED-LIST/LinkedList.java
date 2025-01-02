
import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }

}

/*
 * class Student{
 * int rollNo;
 * String name;
 * int marks[] = new int[3];
 * }
 */

class LinkedListOperation<T> {

    Node<T> head;
    Node<T> tail;

    int length = 0;

    LinkedListOperation() {

    }

    Node<T> createNode(T data) {
        Node<T> node = new Node<>(data);
        return node;
    }

    void addAtInd(int ind, T data) {
        if (ind < 0 || ind > length) {
            System.out.println("Invalid Index!! Can't Add!!");
        } else if (ind == 0) {
            addAtBeg(data);
        } else if (ind == length) {
            addAtEnd(data);
        } else {
            Node<T> newNode = createNode(data);

            Node<T> temp = head;

            for (int i = 1; i < length; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            length += 1;
        }
    }

    void addAtBeg(T data) {

        Node<T> newNode = createNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length += 1;
            return;
        }

        newNode.next = head;
        head = newNode;

        length += 1;

    }

    void addAtEnd(T data) {

        Node<T> newNode = createNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

            length += 1;

            return;
        }

        tail.next = newNode;
        tail = newNode;

        length += 1;

        /*
         * Node<T> temp = head;
         * while(temp.next != null){
         * temp = temp.next;
         * }
         * temp.next = newNode;
         */

    }

    void deleteAtBeg() {
        if (head == null) {
            System.out.println("Linked List is Empty ... ");
        } else if (head.next == null) {
            head = null;
        }

        Node<T> temp = head;
        head = head.next;
        temp = null;

        length -= 1;

    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("Linked List is Empty ... ");
        } else if (head.next == null) {
            head = null;
        }

        Node<T> temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        length -= 1;

    }

    void deleteAtInd(int idx) {
        if (idx < 0 || idx > length) {
            System.out.println("Invalid Index!! Can't Delete!!");
        } else if (idx == 0) {
            deleteAtBeg();
        } else if (idx == length) {
            deleteAtEnd();
        }

        Node<T> temp = head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        Node<T> temp2 = temp.next;

        temp.next = temp2.next;

        temp2.next = null;
        temp2 = null;

        System.out.println("Node at " + idx + " Deleted ... ");

        length -= 1;

    }

    void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

public class LinkedList {
    public static void main(String[] args) {
        // Node<Student> node = new Node<>();

        LinkedListOperation<Integer> obj = new LinkedListOperation<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add at End");
            System.out.println("2. Add at Begening");
            System.out.println("3. Add at Index");
            System.out.println("4. Print");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Begening");
            System.out.println("7. Delete at Index");
            System.out.println("0. Exit");
            System.out.println("Enter the Choice - ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter a Value - ");
                    int data = sc.nextInt();
                    obj.addAtEnd(data);
                }

                case 2 -> {
                    System.out.println("Enter a Value - ");
                    int data = sc.nextInt();
                    obj.addAtBeg(data);
                }

                case 3 -> {
                    System.out.println("Enter a Index - ");
                    int ind = sc.nextInt();
                    System.out.println("Enter a Value - ");
                    int data = sc.nextInt();
                    obj.addAtInd(ind, data);
                }

                case 4 -> {
                    System.out.println("The Linked List Is ... ");
                    obj.print();
                }

                case 5 -> {
                    System.out.println("Node at end Deleted ... ");
                    obj.deleteAtEnd();
                }

                case 6 -> {
                    System.out.println("Node at Begening Deleted ... ");
                    obj.deleteAtBeg();
                }

                case 7 -> {
                    System.out.println("Enter an Index - ");
                    int idx = sc.nextInt();
                    obj.deleteAtInd(idx);
                }

                case 0 -> {
                    return;
                }
            }

        }

    }
}
