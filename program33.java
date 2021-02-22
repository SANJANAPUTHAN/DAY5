package ArrayDemo;


public class program33{
static int j=20;
public static void main(String argv[]){
int i=10;
program33 p = new program33();
p.amethod(i);
System.out.println(i);
System.out.println(j);
}
public void amethod(int x){
x=x*2;
j=j*2;
}
}

//option 3