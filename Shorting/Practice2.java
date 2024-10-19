package Shorting;

public class Practice2 {
    static void sortFruits(String[] fruits){
        for (int i = 0; i < fruits.length; i++) {
            int min_index=i;
            for (int j = i+1; j < fruits.length; j++) {
                if (fruits[j].compareTo(fruits[min_index])<0) {
                    min_index=j;   
                }
            }
            String temp=fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;

        }
    }
    public static void main(String[] args) {
        String[ ] fruits = {"kiwi","apple","papaya","mango"};
        sortFruits(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+" ");
        }
    }
    
}
