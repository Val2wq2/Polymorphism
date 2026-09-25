public class BSU_Member {
    int id;
    String name;
    char gender;
    int age;
    String status;
    // Lab work: Create default constructor and overloaded constructor, setter and getter

    BSU_Member(){
        this.id = id;
        this.name = "Oluwatosin";
        this.gender = gender;
        this.age = age;
        this.status = "Unknown";
    }

    BSU_Member(int id, String name, char gender, int age, String status){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public char getGender() {
        return this.gender;
    }

    public String getStatus() {
        return this.status;
    }

    public void display_information(){
        System.out.println("Status: "+ status);
    }
}
