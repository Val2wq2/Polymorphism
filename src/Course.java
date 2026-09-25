public class Course {
    String name;
    int course_number;
    int credit;

    private String classroom;

    // Students
    // Instructor

    Course(){
        name = "";
        course_number = 0;
        credit = 0;
    }

    Course(int course_number, int credit, String name){
        this.course_number = course_number;
        this.credit = credit;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCourse_number(int courseNumber){
        this.course_number = courseNumber;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    private void setClassroom(String classroom){
        this.classroom = classroom;
    }

    public String getName(){
        return this.name;
    }

    public int getCourse_number(){
        return this.course_number;
    }

    public int getCredit(){
        return this.credit;
    }

    private String getClassroom(){
        return this.classroom;
    }


    // Setters and getters are similar to methods
    // Methods signature: Acccess_modifier, Return_type, Method_name (Param_type Param_name){}
    // Return types: void,int, String, boolean, char, array of objects

    public void Set_Classroom(String classroom){
        this.classroom = classroom;
    }

    public String get_Classroom(){
        return this.classroom;
    }

    // Method for displaying attribute values
    public void display_course_information(){
        System.out.println("Course name: " + this.name + " Course number: " + this.course_number);
    }
}

