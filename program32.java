package ArrayDemo;


class base2{
base2(int i){
System.out.println("base constructor");
}
base2(){
}
}
public class program32 extends Base{
public static void main(String argv[]){
	program32 s= new program32();
//One
}
program32()
{
//Two
}
public void derived()
{
//Three
}
}
//3) On the line After //Two put super(10); constructor should be created within another constructor