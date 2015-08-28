import java.util.Scanner;
import java.lang.Integer;

public class CastingDebuggingActivity {
	public static void main(String[] args) {
		Scanner cookie = new Scanner(System.in);
		String input;
		int accumulator = 0;
		
		System.out.print("Gimme a number : ");
		input = cookie.next();
		while (input != "")
		{
			accumulator += Integer.parseInt(input);
			
			System.out.println(" running total => " + accumulator);
			System.out.print("Next number : ");
			input = cookie.next();
		}
	}
}