import java.util.*;
class SeatsFilledException extends Exception{
    int num;

    SeatsFilledException(int n){
        num = n;
    }
}

class Student{
    int regno;
    String name;
    GregorianCalendar doj;
    static int count = 0 ;

    Student(String n, int dd,int mm,int yy) throws SeatsFilledException{
        if (count > 3){
            throw new SeatsFilledException(3);
        }
        this.regno = (yy%100) *100 + count++ ;
        name = n;
        this.doj = new GregorianCalendar(yy,mm,dd);
    }

    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Reg no: " + this.regno);
        System.out.println("Date of joining: " + this.doj.getTime());
        System.out.println("\n");
    }
}

public class StudentExc {
    public static void main(String[] args) {
        Student std[] = new Student[10];
        try {
            std[0] = new Student("Jack",20,11,2020);
            std[1] = new Student("John",30,11,2021);
            std[2] = new Student("Justin",21,10,2019);
            std[3] = new Student("Andrew",10,10,2022);
        } catch (SeatsFilledException exc) {
            System.out.println("Seats are filled");
        }
        
        System.out.println("Displaying student details");
        
        for(int i = 0; i < std.length;i++){
            std[i].display();
        }
    }
}
