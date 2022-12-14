import java.util.*;

class Node<T>{
    T data;
    Node<T> next;

    Node(T val){
        data = val;
        next = null;
    }
}

class LinkedList<T>{
    Node<T> head;
    
    LinkedList(){
        head = null;
    }


//adding a node towards the end of the list 
    void insert(T ele){
        Node<T> newnode = new Node<T>(ele);
        if(head == null){
            head = new Node<T>(ele);
        }
        newnode.next = null;
        Node<T> temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = newnode;
    }
//Deletes the first occurence of the element in linked list 
    void delete(T ele){
        Node<T> temp = head;
        Node<T> prev = null;
        
        if(temp != null && temp.data == ele){
            head = temp.next;
            return;
        }
        
        while(temp != null && temp.data != ele){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Data not found");
            return;
        }
        prev.next = temp.next;    
    }
//Dispay method

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        } 
    }
}

class LLD{
    public static void main(String[] args) {
        LinkedList<Double> dbList = new LinkedList<Double>();
        LinkedList<Integer> intList = new LinkedList<Integer>();
        
        intList.insert(1);
        intList.printList();
        intList.insert(2);
        intList.printList();
        intList.insert(5);
        intList.printList();
        intList.delete(5);
        System.out.println("Integer linked list:");
        intList.printList();

        
        dbList.insert(1.1);
        dbList.insert(2.4);
        dbList.insert(5.2);
        dbList.delete(5.2);
        System.out.println("Double linked list:");
        dbList.printList();
    }
}
