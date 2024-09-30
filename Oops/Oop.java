/**
 * Oop
 */
public class Oop {
    public static void main(String[] args){
        // Create an object of the class
        Pen p1 = new Pen(); // p1 is an object of the class Pen
        // p1.setColor("blue");
        p1.color="blue";
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("yellow");

    }

    
}

class Pen{
    // prop + function define here 
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;

    }
    void setTip(int newTip) {
        tip = newTip;
    }
    class Student{
        String name;
        int age;
        float percentage;

        void calcPercentage(int phy,int chem,int math) {
            percentage =(phy+chem+math)/3;
        }
    }
}

