// enums practice, enums is like a dropdown lists

enum Gender{Male, Female};
enum Course{Database, Programming, Math, ERP};
enum Semester{Summer, Fall, Spring};

public class RegisterForm {

    String stdname;
    Gender stdgender;
    Course crs;
    Semester sem;

    // Constructor to try the enums
    public RegisterForm(){
        stdname = "No Name";
        stdgender = Gender.Male;
        crs = Course.Math;
        sem = Semester.Spring;
    }

}
