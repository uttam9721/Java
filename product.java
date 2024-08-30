public class product {
    public static int mul(int a,int b){
        int mul=a*b;
        // System.out.println("Multiplication of "+a+" and "+b+" is "+mul);
        return mul;
    }
    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        int prod=  mul(10,20);
    //in call by value always pass copy value it does not pass original value
    // }
    System.out.println(prod);
    }
    
}
