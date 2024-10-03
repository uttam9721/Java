/**
 * Oop
 */
public class Oop {
    public static void main(String[] args){
        // Create an object of the class
        Pen p1 = new Pen(); // p1 is an object of the class Pen
        // p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.getTip());
       p1.setColor("yellow");
       System.out.println(p1.getColor());
      

    }

    

}


class Pen{
    // prop + function define here 
  private   String color;
  private  int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String color) {
       this.color = color;
 
    }
    void setTip(int tip) {
        this.tip = tip;
    }
}

