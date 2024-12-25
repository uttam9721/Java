
package Practice;

public class Revrse {
    public static void Reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
        while (first<last) {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
            
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6};
        Reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }

    }
}