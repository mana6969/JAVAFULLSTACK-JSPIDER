import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exp = "ab{2}c";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(sc.nextLine());
		
		while(m.find())
		{
			System.out.println(m.group());
			System.out.println("------------");
		}
	}

}

// {n} --> exactly 'n' occurrences