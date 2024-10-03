/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}
class Mamal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
// class Dog extends Mamal{
//     String greed;
// }
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }