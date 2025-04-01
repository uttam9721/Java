import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Interger");
        int num = sc.nextInt();
        if(num<0){
            num=num*(-1);
            System.out.println("The absolute Value is "+num);
        }else{
            System.out.println("No value");
        }
    }
    
}
