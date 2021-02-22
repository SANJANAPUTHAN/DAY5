package ArrayDemo;

import java.io.*;
public class program15 {
public static void main(String argv[]){
program15 m=new program15();
System.out.println(m.amethod());
}
public int amethod() {
try {
FileInputStream dis=new FileInputStream("Hello.txt");
}catch (FileNotFoundException fne) {
System.out.println("No such file found");
return -1;
}catch(IOException ioe) {
} finally{
System.out.println("Doing finally");
}
return 0;
}
}

/* it throws a file not found exception and the finally block gets executed  returning -1*/
