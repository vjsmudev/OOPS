//Generic stack
interface StackOps<T>{
    public boolean isEmpty();
    public boolean isFull();
    public T pop();
    public void push(T ele);
}

public class GenericStack<T> implements StackOps<T>{
    private T[] arr;
    private int top;

    public GenericStack(T a[]){
        arr = a;
        this.top = -1;
    }

    public boolean isEmpty(){
        if(this.top == -1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(this.top == arr.length- 1)
            return true;
        return false;
    }
    
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }

    public void push(T ele) {
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            arr[++top] = ele;
        }
    }
    public static void main(String[] args) {
        String [] ary = {""};
        GenericStack Name = new  GenericStack <String>(ary);
        Name.push("Simon");
        Name.push("Alex");
        Name.push("Abel");
        System.out.println(Name.isEmpty());
        System.out.println(Name.isFull());
    }
}
