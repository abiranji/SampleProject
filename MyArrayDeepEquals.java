 
public class MyArrayDeepEquals {
 
    public static void main(String a[]){
        String[] strArr = {"JAVA", "C++", "SCRIPT", "HTML", "C"};
        String[] strArrCopy = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        System.out.println("Are strArr and strArrCopy same? "
                    +Arrays.deepEquals(strArr, strArrCopy));
        String[] strArrMod = {"JAVA", "C++", "PERL", "C"};
        System.out.println("Are strArr and strArrMod same? "
                    +Arrays.deepEquals(strArr, strArrMod));
    }
}