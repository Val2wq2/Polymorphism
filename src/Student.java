public class Student extends BSU_Member {
    double gpa;

    Course [] enrolled_courses;

    Student(){
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    Student(double gpa, String status, Course [] enrolled_courses){
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }


    public Course[] get_Enrolled_Courses(){
        return this.enrolled_courses;
    }

    @Override
    public void display_information(){
        System.out.println("Inside Studnet ------ Status: "+ status);
    }
}
