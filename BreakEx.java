public class BreakEx {
 
    public static void main(String a[]){
        
        for(int i=0;i<10;i++){
            if(i==5){
                System.out.println("breaking the for loop...");
                break;
            }
            System.out.println(i);
        }
    }
}