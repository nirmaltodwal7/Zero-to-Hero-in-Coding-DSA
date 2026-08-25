// Parmeterized constructor is created by programmer if we create any constructor in class

public class student {
    int rollno;
    String name;
    // parameterized constructor
    student(int r, String n) {
        rollno = r;
        name = n;
    }
    // method to display the values
    void display() {
        System.out.println("Student name is " + name + " and roll no. is " + rollno);
    }

    public static void main(String[] args) {
        // creating objects and passing values
        student s1 = new student(01 , "kanishak");
        student s2 = new student(02, "Amit");

        // displaying values of objects
        s1.display();
        s2.display();
    }
}
