public class callvalue {

    public static void swap(int a2,int b2){
        int temp = a2;
        a2 = b2;
        b2 = temp;
        System.out.println("a = " + a2 + " b = " + b2);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);

    }
    
}
