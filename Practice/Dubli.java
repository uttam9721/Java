package Practice;

public class Dubli {
    public static void SearchDurb(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                    
                }
                
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8,9,2,5,6,7,3};
        SearchDurb(arr);

    }
}