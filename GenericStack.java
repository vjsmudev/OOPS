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
        Integer arr[] = {9,8,1};
        GenericStack<Integer> stck = new GenericStack<Integer> (arr);
        stck.push(1);
        stck.push(2);
        stck.push(3);
        stck.pop();
        stck.isEmpty();
        stck.isFull();
    }
}
