public class ConstructorsMain {
    
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.name = "uttam";
            p1.age=21;
            
            Person p2 = new Person();
            p2.name = "maurya";
            p2.age=22;
            System.out.println(p1.name + " " + p1.age);
            System.out.println(p2.name + " " + p2.age);
    
            p1.eat("uttam");
            p2.walk(2);
            System.out.println(Person.count);
            
        }
        
    }
    class Person {
        String name;
        int age;
      static  int count;

        public Person(){
            count++;
            System.out.println("Creating an objects");
        }
    
        void walk(){
            System.out.println(name + " is walking ");
        }
        void eat(){
            System.out.println(name + " is eat ");
        }
        
        void walk(int steps){
            System.out.println(name + " is walking " + steps);
        }
        void eat(String Uttam){
            System.out.println(name + " is eat "+ Uttam);
        }
        
    }
    
