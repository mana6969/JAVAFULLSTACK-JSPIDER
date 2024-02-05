import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Demo1 {

	public static void main(String[] args) {
		String exp = "ab";
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("----------------");
		}
	}

}