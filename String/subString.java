public class subString {
    public static String subString(String str , int si , int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.println(subString(str, 0, 5));
        System.out.println(str.substring(0,5));
    }
    
}
