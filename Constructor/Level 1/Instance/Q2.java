
class Course{
    String courseName;
    int duration;
    int fee;

    static String instituteName = "ABC college";

    public Course(String courseName,int duration,int fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;

    }

    public void displayCourseDetails(){
        System.out.println("Course Name " + courseName );
        System.out.println("Duration " + duration );
        System.out.println("Fee " + fee );
        System.out.println("INstitute " + instituteName );
    }

    static public void updateInstitueName(String name){
        instituteName = name ;
    }

}
public class Q2 {
    public static void main(String[] args) {
        Course obj = new Course("B tech" , 4,9999);
        Course obj2 = new Course("B Arch" , 3,999);
        obj.displayCourseDetails();
        obj2.displayCourseDetails();

        Course.updateInstitueName("SRM College");

        System.out.println();
        obj.displayCourseDetails();
        System.out.println();
        obj2.displayCourseDetails();
    }
}
