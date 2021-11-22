package JavaDemo;
public class Reverse_String
{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	String Pra = "Prasanth";
	String rev = "";
	int len =Pra.length(); //leng=10
	for(int i= len-1;i>0;i--) {
	rev = rev+ Pra.charAt(i);
	}
	System.out.println(rev);
	}
}