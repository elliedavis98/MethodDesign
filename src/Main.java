import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creating courses as objects
        Course c1 = new Course("English: ");
        Course c2 = new Course("Math: ");
        Course c3 = new Course("Science: ");

        //Creating the course list in a array list
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        //creating the student objects and setting the value of their test scores
        Student Ellie = new Student("Ellie", "Davis", 90, 87, 60);
        Student James = new Student("James", "Keating", 90, 89, 99);
        Student Sydney = new Student("Sydney", "Serrano", 93, 94, 95);

        //Printing out the values of their scores using the toString
        System.out.println(Ellie);
        System.out.println(James);
        System.out.println(Sydney);

    }
}


// using a class to initialize the courses names
class Course {
    String name;

    //Constructor for the course objects
    public Course(String name) {
        this.name = name;


    }
}

class Student {
    //variables for the components of the student
    String firstName, lastName;
    private int ts1, ts2, ts3;
    Course c1, c2, c3;

    //constructor for the student objects
    public Student(String firstName, String lastName, int ts1, int ts2, int ts3) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ts1 = ts1;
        this.ts2 = ts2;
        this.ts3 = ts3;

        //getters and setters for the TestScores to be able to call to from the toString
    }
    public int getTs1() {
        return ts1;
    }

    public int geTts2() {
        return ts2;
    }

    public int getTs3() {
        return ts3;
    }

    public void setTs1(int ts1) {
        this.ts1 = ts1;
    }

    public void setTs2(int ts2) {
        this.ts2 = ts2;
    }

    public void setTs3(int ts3) {
        this.ts3 = ts3;
    }

    // getters and setters to get the name of the courses
    public Course getC1() {
        return c1;
    }

    public Course getC2() {
        return c2;
    }
    public Course getC3() {
        return c3;
    }
    public void setC1(Course c1) {
        this.c1 = c1;
    }
    public void setC2(Course c2) {
        this.c2 = c2;
    }

    public void setC3(Course c3) {
        this.c3 = c3;
    }
    //method to compute the average of the students scores, called to in the toString
    public double getAverage() {
        return (ts1 + ts2 + ts3) / 3.0;
    }

    // toString to be print out information printed in the driver/main class
    public String toString() {
        String result;
        result = "Student: " + firstName + " " + lastName + getC1() + getTs1() + "," + getC2() + geTts2() + "," + getC3() + getTs3()+ ", Average: "+ getAverage() + "\n";
        return result;
    }

}
