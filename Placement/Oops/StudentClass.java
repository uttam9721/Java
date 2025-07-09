
public class StudentClass {
    // creating new dataType.
    public static class Student{
        String name;   //these are the dataType
        int rno;
        double percent;
    }

    public static void main(String[] args) {
        Student x = new Student();  //this is declaration
        x.name = "Uttam";   // these are initialization
        x.rno = 24;
        x.percent = 92.5;
        System.out.println(x.name);


        Student s = new Student();//these are objects
        s.name="Maurya";
        s.percent=97.2;
        s.rno=3;
    }
    
}
