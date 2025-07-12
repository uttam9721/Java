
// public class StudentClass {
//     // creating new dataType.
//     public static class Student{
//         String name;   //these are the dataType
//         int rno;
//         double percent;
//     }

//     public static void main(String[] args) {
//         Student x = new Student();  //this is declaration
//         x.name = "Uttam";   // these are initialization
//         x.rno = 24;
//         x.percent = 92.5;
//         System.out.println(x.name);


//         Student s = new Student();//these are objects
//         s.name="Maurya";
//         s.percent=97.2;
//         s.rno=3;
//     }
    
// }

package Placement.Oops;
import java.util.*;

public class StudentClass {
   static class Student{
        String name;
        int age;
        void walk(){
            System.out.println("Uttam is walking");
        }
        void talk(){
            System.out.println("Uttam is talking");
        }
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Uttam";
        s1.age=21;
        s1.walk();
        s1.talk();
        System.out.println(s1.name +" "+s1.age);
    }
}
