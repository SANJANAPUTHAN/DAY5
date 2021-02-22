package ArrayDemo;

class Base {}
class Sub extends Base {}
class Sub2 extends Base {}
public class program17{
public static void main(String argv[]){
Base b=new Base();
Sub s=(Sub) b;
}
}

//runtime exception stating class cannot be cast due to narrowing of parent class type to child class