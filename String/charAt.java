public class charAt {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        // System.out.println(str.charAt(1));
        printletter(str);
        }
}
