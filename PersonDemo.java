/*Create a Person class with private instance variables for the person's name and birth date. Add 	
	appropriate accessor methods for these variables. Then create a subclass College Graduate with private 	
	instance variables for the student's GPA and year of graduation and appropriate accessors for these 
	variables. Include appropriate constructors for your classes. Then create a class with main() method 
	that demonstrates your classes. */
import java.util.*;
class Person{
    private String name;
    private GregorianCalendar dob;

    void setName(String n){
        name = n;
    }

    String getName(){
        return name;
    }

    void setDOB(GregorianCalendar cal){
        dob = cal;
    }

    GregorianCalendar setDOB(){
        return this.dob;
    }
    

    Person(String n, int d, int m, int y){
        name = n;
        this.dob = new GregorianCalendar(d,m,y);
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("DOB: " + this.dob.getTime());
    }
}

class CollegeGraduate extends Person{
    private double gpa;
    private int gradyr;

    CollegeGraduate(String n, int d, int m, int y,double grdpa, int yr){
        super(n,d,m,y);
        gradyr = yr;
        gpa = grdpa;
    }

    void setGpa(double g){
        gpa = g;
    }

    double getGpa(){
        return gpa;
    }

    void setGradyr(int y){
        gradyr = y;
    }

    int getGradyr(){
        return gradyr;
    }

    void printDetails(){
        System.out.println("GPA: " + gpa);
        System.out.println("Graduating year: " + gradyr);

    }
}

class PersonDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int d,m,y,gradyr;
        double gpa;
        System.out.println("Enter person details:");
        System.out.println("Name:");
        name = sc.nextLine();
        System.out.println("DOB(dd/mm/yyyy):");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();

        Person person = new Person(name,d,m,y);
        System.out.println("Displaying Person details:");
        person.display();
        
        System.out.println("Enter student details:");
        sc.nextLine();
        System.out.println("Name: ");
        name = sc.nextLine();
        
        System.out.println("DOB(dd/mm/yyyy):" );
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();
        
        System.out.println("GPA: ");
        gpa = sc.nextDouble();
        System.out.println("Graduating year:");
        gradyr = sc.nextInt();

        CollegeGraduate grad = new CollegeGraduate(name, d, m, y, gpa,gradyr);
        System.out.println("Displaying student details: ");
        grad.display();
        grad.printDetails();
    }
}