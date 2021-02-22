package ArrayDemo;

public class program14 {
public static void main(String[] args) {
//	int i=0;
//	if(i) {
//	System.out.println("Hello");
//	}
	
	/* it throws an error since the condition in if expects a boolean value
	 * 
	 */
	boolean b=true;
	boolean b2=true;
	if(b==b2) {
	System.out.println("So true");
	}
	/* it throws op so true since the op of the expression in the if block returns a value bolean
	 * 
	 */
	
	int i=1;
	int j=2;
	if(i==1|| j==2)
	System.out.println("OK");
	/* it throws op ok since the op of the expression in the if block returns a value bolean
	 * 
	 */
	//if(i==1 &| j==2)
	System.out.println("OK");
	
	/*error since there is no logocal operator like &|
	 * 
	 */
}
}
