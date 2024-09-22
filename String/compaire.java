public class compaire {
    public static void main(String[] args) {
        String s1 = "uttam";
        String s2 = "uttam";
        String s3 = new String("uttam");

        if(s1==s2){
            System.out.println("s1 and s2 are same");
        }
        else{
            System.out.println("s1 and s2 are not same");
            }
           if(s1.equals(s3)){
            System.out.println("same");
           }
    }
    
}
