// Parmeterized constructor is created by programmer if we create any constructor in class

// public class student {
//     int rollno;
//     String name;
//     // parameterized constructor
//     student(int r, String n) {
//         rollno = r;
//         name = n;
//     }
//     // method to display the values
//     void display() {
//         System.out.println("Student name is " + name + " and roll no. is " + rollno);
//     }

//     public static void main(String[] args) {
//         // creating objects and passing values
//         student s1 = new student(01 , "kanishak");
//         student s2 = new student(02, "Amit");

//         // displaying values of objects
//         s1.display();
//         s2.display();
//     }
// }

// Constructor overloading is possible in java. We can have multiple constructors with different parameter lists. The compiler differentiates these constructors by the number of parameters in the list and their types.

public class student{
    int age;
    String name;

    // constructor with one parameter
    student(int age){
        this.age = age;

    }

    // constructor with two parameters
    student(int age , String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("Student name is " + name + " and age is " + age);
    }
    public static void main(String[] args) {
        student s1 = new student(20);
        student s2 = new student(21 , "Kanishak");

        s1.display();
        s2.display();
    }
}