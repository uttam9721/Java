import java.util.*;

public class Main {
    public static void functionwithpara(int num1, int num2) {  //parameters or formal parameter
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
    
        functionwithpara(a, b);//a,b is arguments or actual parameters
    }
}
