package Capgemini.Training;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * Rigorous Test :-)
	 */
	//    @Test
	//    public void shouldAnswerWithTrue() {
	//        assertTrue(true);
	//    }
	public static void main(String[] args) {
		App app=new App();
		String regex="^(.+)@(.+)$";
		String email=app.userEmail("..@..");
		Pattern pattern=Pattern.compile(regex);

		Matcher match=pattern.matcher(email);
		System.out.println("email matches : "+match.matches());

		String regex1="[0-9]+";
		int pwd=app.userPassWord(456123);
		Pattern pattern1=Pattern.compile(regex1);

//		Matcher match1=pattern1.matcher(pwd);
//		System.out.println("password matches matches : "+match1.matches());
	}
}

