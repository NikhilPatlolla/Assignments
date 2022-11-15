package ForException;
import java.lang.annotation.*;

//@Target(ElementType.METHOD)
@Target({ElementType.TYPE,ElementType.METHOD, ElementType.LOCAL_VARIABLE} )
@Retention(RetentionPolicy.RUNTIME)


@interface CricketPlayer {
	String gameName() default "Cricket";
	int runs() default 20000;
}

@CricketPlayer
class Virat {
	private String name;
	private int age;

	public void disp() {
		System.out.println("Virat is Indian");
	}
}

public class LaunchAnnotation {
	public static void main(String[] args) {
		System.out.println("end");
		float a = 22.0f/7;
		System.out.println(a);
	}
}
