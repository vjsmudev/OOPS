/* Lab Exercise 2
	Create a Building class and two subclasses, House and School. The Building class contains fields for 
	square footage and stories. The House class contains additional fields for number of bedrooms and 
	batlhs. The School class contains additional fields for number of classrooms and grade level (for 
	example, elementary or junior high). All the classes contain appropriate get and set methods. Create a 
	main method that declares objects of each type.
*/
import java.util.*;

class Building{
    private double sqrfootage;
    private int stories;

    Building(double sf, int s){
       sqrfootage = sf;
       stories = s;
    }

    void setSqrfootage(double sf){
        sqrfootage = sf;
    }

    double getSqrfootage(){
        return sqrfootage;
    }

    void setStoreies(int s){
        stories = s;
    }

    int getStories(){
        return stories;
    }

    void display(){
        System.out.println("Square footage: " + sqrfootage + " and " + "Stories: " + stories);
    }
}

class House extends Building{
    private int bedrooms;
    private int bathrooms;

    House(double sqrft,int stry,int bdrm,int bthrm){
        super(sqrft,stry);
        bedrooms = bdrm;
        bathrooms = bthrm;
    }

    void setBedrm(int bdrm){
        bedrooms = bdrm;
    }

    int getBedrm(){
        return bedrooms;
    }

    void setBathrm(int bthrm){
        bathrooms = bthrm;
    }

    int setBathrm(){
        return bathrooms;
    }

    void displayHouse(){
        System.out.println("Bedrooms: " + bedrooms + " and " + "Bathrooms: " + bathrooms);
    }
}

class School extends Building{
    private int classrooms;
    private String grade;
    
    School(double sqrfootage, int stories, int classrm, String g){
        super(sqrfootage,stories);
        classrooms = classrm;
        grade = g; 
    }

    
    void setClassrm(int classrm){
        classrooms = classrm;
    }

    int getClassrm(){
        return classrooms;
    }

    void setGrade(String grd){
        grade = grd;
    }

    String getGrade(){
        return grade;
    }

    void displaySchool(){
        System.out.println("Classroom: " + classrooms + " and " + "Grade: " + grade);
    }
}

class SchoolDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sqft;
        int stories,bdrm,bathrm,classrm;
        String grade;
        System.out.println("\nEnter the details for the building:\n");
        System.out.println("Sqr footage: ");
        sqft = sc.nextDouble();
        System.out.println("Stories: ");
        stories = sc.nextInt();

        Building bld =  new Building(sqft,stories);
        System.out.println("\nDisplaying the Building\n");
        bld.display();

        System.out.println("\nEnter the details for the house:\n ");
        System.out.println("Sqr footage: ");
        sqft = sc.nextDouble();
        System.out.println("Stories: ");
        stories = sc.nextInt();
        System.out.println("Bedrms: ");
        bdrm = sc.nextInt();
        System.out.println("Bathrms: ");
        bathrm = sc.nextInt();

        House hse = new House(sqft,stories,bdrm, bathrm);
        hse.display();
        hse.displayHouse();

        System.out.println("\nEnter the details for the school:\n ");
        System.out.println("Sqr footage: ");
        sqft = sc.nextDouble();
        System.out.println("Stories: ");
        stories = sc.nextInt();
        System.out.println("Classrooms : ");
        classrm = sc.nextInt();
        System.out.println("Grade : ");
        grade = sc.nextLine();

        School sch = new School(sqft, stories, classrm, grade);
        System.out.println("\nDisplaying details for school:\n");
        sch.display();
        sch.displaySchool();
    }
}