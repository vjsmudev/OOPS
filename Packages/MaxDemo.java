import static myPackages.p1.Maximum.*;
import myPackages.p1.Maximum;
public class MaxDemo {
    public static void main(String[] args) {
        int max1 = Maximum.max(1,2,3);
        System.out.println(" Largest element is " + max1);
        float max2 = Maximum.max(1.1f,2.2f,3.3f);
        System.out.println(" Largest element is " + max2);
        int arr[] = {9,8,10,30,40};
        int max3 = Maximum.max(arr);
        System.out.println("Largest element in the array " + max3);
        int arr1[][] = {{9,7,6},{10,7,6}};
        int max4 = Maximum.max(arr1);
        System.out.println("Largest element in the matrix is " + max4);
    }
}


