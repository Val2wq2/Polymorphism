// https://github.com/Val2wq2/Polymorphism
public class Main {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.display_course_information();

        COSC113 section1 = new COSC113();
        section1.display_course_information();

        // Polymorphism
        Course cosc214 = new Course();
        Course section2 = new COSC113();
        // The relationship is: IS-A relationship between course and COSC113

        cosc214.display_course_information();
        section2.display_course_information();

        // Student object
        Student arturo = new Student();
        Course math141 = new Course();
        Course frac = new Course();
        Course cosc107 = new Course();
        Course eng102 = new Course();
        Course soc101 = new Course();

        arturo.enrolled_courses[0] = math141;
        arturo.enrolled_courses[1] = frac;
        arturo.enrolled_courses[2] = cosc107;
        arturo.enrolled_courses[3] = eng102;
        arturo.enrolled_courses[4] = soc101;

//        Instructor instructor = new Instructor();
//        instructor.display_information();
        BSU_Member []members = new BSU_Member[10];

        BSU_Member b1, b2;
        // Creating an object of student type and storing the reference in a BSU_Member type variable124
        b1 = new Student();
        b2 = new Instructor();

        members[0] = b1;
        members[1] = b2;

        System.out.println("==========================");

        members[2] = new Instructor();
        members[3] = new Instructor("Math");
        members[4] = new Instructor(45, "Faculty", "Computer Science");
        members[5] = new Student();
        members[6] = new Student(3.5);
        members[7] = new Student(3.8, "Student", new Course[]{math141, eng102});
        members[8] = new BSU_Member(200, "Avjoy Chakam", 'M', 30, "Staff");
        members[9] = new BSU_Member(201, "Robin Diaz", 'F', 22, "Alumni");

        System.out.println("==========================");

        for (int j = 0; j<10; j++){
            members[j].display_information();
        }
    }
}