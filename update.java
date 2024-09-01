public class update {

    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
           marks[i]=marks[i]+1;
                 
            
        }
    }
    public static void main(String[] args) {
        int marks[] = { 90, 85, 95, 80, 75};
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        
    }
    // System.err.println();
    
}
}
