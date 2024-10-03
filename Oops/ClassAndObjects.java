public class ClassAndObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "uttam";
        p1.age=21;
        
        Person p2 = new Person();
        p2.name = "maurya";
        p2.age=22;
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);
        
    }
    
}
class Person {
    String name;
    int age;

}
