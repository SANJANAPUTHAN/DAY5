package ArrayDemo;

public class Scope{
private int i;
public static void main(String argv[]){
Scope s = new Scope();
s.amethod();
}//End of main
public static void amethod(){
//System.out.println(i);
}//end of amethod
}//End of class

//errir occurs because a static reference cannot be used from non static method