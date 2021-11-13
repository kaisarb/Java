/**
 * 
 */
package pxbook;

/**
 * @author Кайсар
 *
 */
public class Book {
	static int maxAmountOfPages = 500;
	String title = "Unknown Title";
	String[] authors = new String[] {"Anonymous"};
	int yearReleased = 2014, copiesSold = 0, nrOfPages = 1400;
	public static void main(String[] args) {
		Book book1 = null;
		System.out.println("Now, book equals: " + book1);
		book1 = new Book();
		System.out.println("And now, book equals: " + book1);
	}
}
