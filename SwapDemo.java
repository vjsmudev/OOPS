/*Write a generic method to exchange the positions 
of two different elements in an array. */

import java.util.*;

class Gen<T>{
     T arr[];

    Gen(T a[]){
        arr = a;
    }

    void swap(int i,int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void display(){
        for(int i = 0;i<arr.length;i++)
            System.out.println(" "+ arr[i]);
    }
}

class SwapDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,j;
        int i;
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter the elements in the array");
        
        for(i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        Gen<Integer> iOb = new Gen<Integer>(arr);
        System.out.println("Enter the indexes to exchange");
        n = sc.nextInt();
        j = sc.nextInt();
        System.out.println("Before switching:");
        iOb.display();

        iOb.swap(n,j);

        System.out.println("After switching:");
        iOb.display();
    }
}
