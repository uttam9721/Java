package Practice;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,20,30,50,2,6,4,5};
        int firstLargest=0;
        int secondLargest=0;
        for (int i = 0; i < arr.length; i++) {
            if (firstLargest<arr[i]) {
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }else if (secondLargest<arr[i]) {
                secondLargest=arr[i];
                
            }
                
            }
            System.out.println(firstLargest+" "+ secondLargest);
        }
    }
