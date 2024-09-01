public class Reverse {
    public static void reverse(int arr[]){
        int first=0,last=arr.length-1;
        // for (int i = 0; i < arr.length; i++) {
            while (first<last) {
                int temp=arr[last];
                arr[last]=arr[first];
                arr[first]=temp;

                first++;
                last--;

                
            }
        }

    // }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            
        }
        
}
}
