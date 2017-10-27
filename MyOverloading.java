
public class MyOverloading {

public MyOverloading(){
    System.out.println("Inside default constructor");
}
public MyOverloading(int i){
System.out.println("Inside single parameter constructor with int value");
}
public MyOverloading(String str){
System.out.println("Inside single parameter constructor with String object");
}
public MyOverloading(int i, int j){
System.out.println("Inside double parameter constructor");
}

public static void main(String a[]){
MyOverloading m1 = new MyOverloading();
MyOverloading m2 = new MyOverloading(10);
MyOverloading m3 = new MyOverloading(10,20);
MyOverloading m4 = new MyOverloading("java2novice");
}
}