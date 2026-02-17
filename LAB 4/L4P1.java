import java.util.Scanner;
import java.util.InputMismatchException;
//import FilenotFoundException;
import java.lang.ArithmeticException;
class L4P1{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		try{
			System.out.println("enter the numberss");
			System.out.println("enter first number");
			int x = s.nextInt();
			System.out.println("enter second number");
			int y = s.nextInt();
			System.out.println(x/y);
		}catch(InputMismatchException ime){
			System.out.println(ime.getMessage());
		}catch(ArithmeticException ame){
			System.out.println(ame.getMessage());
		}
		finally{
			System.out.println("Exception handled.");
		}
	}
}
