package src.main.java.chapter04.comment;

/**
 * This is Javadocs Class
 *
 * @author Heize
 * @since 1.0
 *
 * @deprecated {@link NewJavadocs}
 */
public class Javadocs {

	/**
	 * say hello
	 *
	 * @deprecated {@link NewJavadocs#sayHelloToYou(String)}
	 */
	public void helloJavadocs() {
		// HEIZE remove
		System.out.println("Hello Javadocs");
	}

}
