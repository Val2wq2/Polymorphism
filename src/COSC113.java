// Parent/Super/Base class: Course
// Child/Sub/dervied class: COSC113
public class COSC113 extends Course {
    //Public,default,protected attributes are inherited
    // Not inherited
    String syllabus;
    String coding_language;
    Instructor i1;
    Student[] students;


    COSC113(){
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
        this.course_number = 113;
        this.credit = 4;
        this.name = "COSC113";
    }

    public void setSyllabus(String syllabus){
        this.syllabus = syllabus;
    }

    public void setCoding_language(String coding_language){
        this.coding_language = coding_language;
    }

    public void setI1(Instructor i1){
        this.i1 = i1;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public String getSyllabus(){
        return this.syllabus;
    }

    public String getCoding_language(){
        return this.coding_language;
    }

    public Instructor getI1(){
        return this.i1;
    }

    public Student [] getStudents(){
        return this.students;
    }

    // Parent class Constructors are not inherited, but can be invoked/called
    COSC113(int course_number, int credit, String name){
        // super() wil invoke the parent class's default constructor - Course()
        // super();
        // super() can only be called once and must be the first line

        super(course_number, credit, name);
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
    }

    // Methods: Public,default,protected methods are inherited
    // Setters and Getters - Lab Work

    // Method Overriding: Defining a method with the same method signature from the parent class

    @Override
    public void display_course_information() {
        // Lab work - use super.ATTRIBUTE-NAME inside a print statement
//        super.display_course_information();
        System.out.println("Course name: " + super.name + " Course number: " +
                super.course_number);

        System.out.println("Syllabus: "+ this.syllabus + " Language: " + this.coding_language +
                " Instructor: "+ this.i1 + " Students: "+ this.students);
    }


    // Package: java files under same folder are considered to be in the same package
}
