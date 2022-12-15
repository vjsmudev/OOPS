//Exceptions stack 
import java.util.*;
class PushException extends Exception{}
class PopException extends Exception{}

class Stack{
    int top;
    int arr[];

    Stack(int a[]){
        top = -1;
        arr = a;
    }

    boolean isFull(){
        return top == arr.length - 1;
    }

    boolean isEmpty(){
        return top == - 1;
    }

    void push(int ele) throws PushException{
        if(isFull()){
            throw new PushException();
        }
        arr[++top] = ele;
    }

    int pop() throws PopException{
        if(isEmpty()){
            throw new PopException();
        }
        return arr[top--];
    }
}

public class StackDemo {
    public static void main(String[] args) {
        int arr[] = new int[40];
        Stack stck = new Stack(arr);
        int ele;
        try{
            System.out.println("Pushing 4,5,6,7 in the stack");
            stck.push(4);
            stck.push(5);
            stck.push(6);
            stck.push(7);
        }
        catch(PushException exc){
            System.out.println("Stack overflow");
        }
        try{
           ele = stck.pop();
           System.out.println(ele + " popped");
        }
        catch(PopException exc){
            System.out.println("Stack overflow");
        }
    }
}
