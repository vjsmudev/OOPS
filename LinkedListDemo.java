/* Lab Exercise 3
	Define a generic List class to implement a singly linked list and show the use of the generic class 
	for two different class types Integer and Double class objects.
*/
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

class LinkedListDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Double> dbList = new LinkedList<Double>();
        LinkedList<Integer> intList = new LinkedList<Integer>();
        Integer ch, lstch, intele;
        Double dbele;
        while(true){
            System.out.println("Select:\n1.Integer Linked List\n\n2.Double Linked List\n");
            System.out.println("Enter choice(0 to exit):");
            lstch = sc.nextInt();
            
            if(lstch == 0)
                break;
            if(lstch != 1 && lstch != 2){
                System.out.println("Re-select");
                continue;
            }
            System.out.println("\nList of Operations:\n1.Insert node\n2.Delete node\n3.Display List\n");
            System.out.println("Enter choice(0 to exit): ");
            ch = sc.nextInt();

        if(ch == 0)
            continue;

        if(ch == 1){
            System.out.println("Enter the value to insert:");
            if(lstch == 1){
            intele =sc.nextInt();
            intList.insert(intele);
        }
        
        else{
            dbele =sc.nextDouble();
            dbList.insert(dbele);
        }
    }
    else if(ch == 2){
        System.out.println("Enter the value to delete:");
        if(lstch == 1){
            intele  = sc.nextInt();
            intList.delete(intele);
        }
        else{
            dbele = sc.nextDouble();
            dbList.delete(dbele);
        }
    }
    else if(ch == 3){
        System.out.println("Printing all the elements in the lists");
        if(lstch == 1){
            intList. printList();
        }
        else{
            dbList. printList();
        }
    }
}
}
}
