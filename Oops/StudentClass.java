public class StudentClass {
    public static class Student {
        // creating a new data type 
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Rahul";
        x.rno=24;
        x.percent=78.5;
        System.out.println(x.name);
    }
    
}
