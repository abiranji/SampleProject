public class ForEachLoop {
 
    public static void main(String a[]){
        List<String> al = new ArrayList<String>();
        al.add("java2novice");
        al.add("for each");
        al.add("java 1.5");
        al.add("www.oracle.com");
        
        for(String str:al){
            System.out.println(str);
        }
    }
}