import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * The app that drives the project.
 * @author amelialutz
 *
 */
public class App {
	public static void main(String[] args) {
		// Creates a scanner to prompt for input.
		Scanner sc = new Scanner(System.in);
		// Creates the array list of all images.
		ArrayList<EnhancedImage> clothes = initClothes();
		
		// Prompt for user information and creates the user.
		System.out.print("What is your name? ");
		String name = sc.next();
		System.out.print("Enter 'M' for men's clothes or 'W' for women's clothes: ");
		String gender = sc.next();
		while (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("w")) {
			System.out.print("Sorry, please enter 'M' for men's clothes or 'W' for women's clothes: ");
			gender = sc.next();
		}
		System.out.print("Enter 'F' for formal clothes or 'I' for informal clothes: ");
		String atmosphere = sc.next();
		while (!atmosphere.equalsIgnoreCase("f") && !atmosphere.equalsIgnoreCase("i")) {
			System.out.print("Sorry, please enter 'F' for formal clothes or 'I' for informal clothes: ");
			atmosphere = sc.next();
		}
		System.out.print("Enter 'U' for upper section (tops) or 'L' for lower section (pants): ");
		String section = sc.next();
		while (!section.equalsIgnoreCase("u") && !section.equalsIgnoreCase("l")) {
			System.out.println("Sorry, please enter 'U' for upper section (tops) or 'L' for lower section (pants): ");
			section = sc.next();
		}
		String key = gender + atmosphere + section;
		Human user = new Human(name, key.toUpperCase());
		//System.out.println(user.toString());
		
		// Create a new array based on user preference.
		ArrayList<EnhancedImage> newClothes = new ArrayList<EnhancedImage>();
		for (EnhancedImage image : clothes) {
			if (image.getKey().equals(user.getKey())) {
				newClothes.add(image);
			}
		}
		for (EnhancedImage image : newClothes) {
			System.out.println(image.toString());
		}
		
	}
	
	public static ArrayList<EnhancedImage> initClothes() {
		ArrayList<EnhancedImage> images = new ArrayList<EnhancedImage>();
		// creates and adds tops
		EnhancedImage top1 = new EnhancedImage("W", "F", "U", "S", "B", "resources/top1.jpg");
		EnhancedImage top2 = new EnhancedImage("W", "I", "U", "T", "G", "resources/top2.jpg");
		EnhancedImage top3 = new EnhancedImage("W", "I", "U", "T", "E", "resources/top3.jpg");
		EnhancedImage top4 = new EnhancedImage("M", "F", "U", "J", "B", "resources/top4.jpg");
		EnhancedImage top5 = new EnhancedImage("M", "I", "U", "T", "B", "resources/top5.jpg");
		EnhancedImage top6 = new EnhancedImage("M", "I", "U", "S", "Y", "resources/top6.jpg");
		EnhancedImage top7 = new EnhancedImage("M", "I", "U", "J", "Y", "resources/top7.jpg");
		EnhancedImage top8 = new EnhancedImage("M", "F", "U", "J", "Y", "resources/top8.jpg");
		EnhancedImage top9 = new EnhancedImage("M", "F", "U", "J", "C", "resources/top9.jpg");
		EnhancedImage top10 = new EnhancedImage("M", "I", "U", "J", "B", "resources/top10.jpg");
		EnhancedImage top11 = new EnhancedImage("M", "F", "U", "J", "C", "resources/top11.jpg");
		EnhancedImage top12 = new EnhancedImage("M", "I", "U", "S", "R", "resources/top12.jpg");
		EnhancedImage top13 = new EnhancedImage("M", "I", "U", "S", "C", "resources/top13.jpg");
		EnhancedImage top14 = new EnhancedImage("M", "I", "U", "T", "W", "resources/top14.jpg");
		EnhancedImage top15 = new EnhancedImage("M", "I", "U", "T", "C", "resources/top15.jpg");
		images.add(top1);
		images.add(top2);
		images.add(top3);
		images.add(top4);
		images.add(top5);
		images.add(top6);
		images.add(top7);
		images.add(top8);
		images.add(top9);
		images.add(top10);
		images.add(top11);
		images.add(top12);
		images.add(top13);
		images.add(top14);
		images.add(top15);
		
		// creates and adds bottoms
		EnhancedImage pant1 = new EnhancedImage("M", "F", "L", "P", "Y", "resources/pant1.jpg");
		EnhancedImage pant2 = new EnhancedImage("M", "I", "L", "P", "C", "resources/pant2.jpg");
		EnhancedImage pant3 = new EnhancedImage("M", "I", "L", "P", "B", "resources/pant3.jpg");
		EnhancedImage pant4 = new EnhancedImage("M", "F", "L", "P", "C", "resources/pant4.jpg");
		images.add(pant1);
		images.add(pant2);
		images.add(pant3);
		images.add(pant4);
		
		return images;
	}
}
