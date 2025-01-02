
import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }

}

/* class Student{
    int rollNo;
    String name;
    int marks[] = new int[3];
} */


class LinkedListOperation<T>{
    
    Node<T> head;
    Node<T> tail;

    int length = 0;

    LinkedListOperation(){

    }

    Node<T> createNode(T data){
        Node<T> node = new Node<>(data);
        return node;
    }

    void addAtInd(int ind, T data){
        if(ind == 0){
            addAtBeg(data);
        }
        else if(ind == length){
            addAtEnd(data);
        }
        else if (ind<length) {
            addAtMid(data);
        }
        else if(ind > length){
            System.out.println("Cannot add for Index greater than length");
        }
    }


    void addAtMid(T data){
        
        Node<T> newNode = createNode(data);

        Node<T> temp = head;
        
        for(int i=1; i<length/2; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        length += 1;

    }


    void addAtBeg(T data){

        Node<T> newNode = createNode(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            length += 1;
            return;
        }

        newNode.next = head;
        head = newNode;

        length += 1;

    }


    void addAtEnd(T data){

        Node<T> newNode = createNode(data);
        
        if(head == null){
            head = newNode;
            tail = newNode;

            length += 1;

            return;
        }

        tail.next = newNode;
        tail = newNode;

        length += 1;

        /* Node<T> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode; */

    }

    void print(){
        Node<T> temp = head;
        while(temp != null){
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
            System.out.println("0. Exit");
            System.out.println("Enter the Choice - ");
            int choice = sc.nextInt();

            switch(choice){
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

                case 0 -> {
                    return;
                }
            }

        }

    }
}
