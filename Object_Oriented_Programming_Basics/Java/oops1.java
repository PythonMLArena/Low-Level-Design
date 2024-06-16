
// class : named grouped of properties and functions ( DATATYPE )
// create a class here
class Student {
    double marks; // class 
    String name;
    int rollname;
    boolean varified = true; // default value in true. 

    // constructor of Student 
    Student (Student other){ // accepting other Student datatype and taking their information
        this.marks = other.marks; // this keyword (ref variable)
        this.name = other.name;
        this.rollname = other.rollname;
    }

    Student (){
        this (0,"default person",1);  // call a constructor from a constructor // if this in not there then default values are 0, null ,0.0
    }

    

    Student (double marks, String name, int rollname){
        this.marks = marks; // this keyword (ref variable)
        this.name = name;
        this.rollname = rollname;
    }

    void greetings() {
        System.out.println("Hello this is "+this.name); // Calling via object this will replace the ref variable 
    }

    void changeName(String newName){
        name= newName;
    }


}




public class Main {
    public static void main(String[] args){
        // Store 5 roll Numbers
        int[] numbers = new int[5];

        // Store 5 Names
        String[] names = new String[5];

        // store marks of 5 Students
        double[] marks = new double[5];

        // created a student entity (class) and created an object (instance) of that entity(class)

        // name1 is instance(copy) of the class called as OBJECT (Variable)
        // Object stored in HEAP memory and References stored in Stack memory
        Student name1 = new Student(); // bydefault values stored are for string is null and others are 0.
        // student() - constructor is spcial function that run when create a object and it allocate variables
        // Java have own contructor which give null and 0 values to class variables





        Student[] name2 = new Student[5]; // declared arrays of objects 
        // new :- dynammically allcates memory and returns reference to it
        // Memory Allocation = , reference store in stack memory and Object stored in heap memory , 
        // if object created and another variable assigned that object then both variable points to same objects




        name1.name="Prathamesh"; // name is Instance Variable.

        // Properties of Object : 
        // State of the Object - 
        // Identity of the Object - 
        // behavior of the Object-
        
        Student name2= new Student(); // calls the contructor with Arugument where we implemented calling constructor from constructor
        Student name3= new Student(name2); // created a new object using another object (Constructor Overloading example)

        






    }
}