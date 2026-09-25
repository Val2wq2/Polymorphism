public class Instructor extends BSU_Member{
    String department;

    Instructor(){
        this.department = "CS";
        this.status = "Faculty";
    }

    Instructor( String department){
        this.department = "CS";
        this.status = "Faculty";
    }

    Instructor(int age, String status, String department){
        this.age = age;
        this.status = status;
        this.department = department;
    }

    // Task: Create a display method that will print the department and status
    @Override
    public void display_information(){
        System.out.println("Inside Instructor ---------- Department: "+ this.department + " Status: "+ this.status);
    }
}
