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
		Scanner sc = new Scanner(System.in);
		//prompt for user information (name) and creates the user
		System.out.print("What is your name? ");
		String name = sc.next();
		Human user = new Human(name);
		
		//creates the array of images
		EnhancedImage[] images = initArray();
		for (int i = 0; i < images.length; i++) {
			JFrame frame = new JFrame();
			ImageIcon icon = new ImageIcon(images[i].getSource());
			JLabel label = new JLabel(icon);
			frame.add(label);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
			//prompt if user likes clothes
			// loop through to decide the user's preferences
			System.out.println("Enter 'Y' if you like the item, 'N' if you don't");
			String pref = sc.next();
			if (pref.equalsIgnoreCase("Y")) {
				images[i].likeImage();
				if (images[i].getLiked()) {
					user.add(images[i]);
				}
			}
			// else it'll go on to the next image
			System.out.println(user.toString());
			frame.dispose();
		}
		System.out.println(user.makeRecommendation(images.length));
	}
	
	public static EnhancedImage[] initArray() {
		EnhancedImage[] images = new EnhancedImage[3];
		images[0] = new EnhancedImage(0, 2, 1, 1, 1, "top1.jpg");
		images[1] = new EnhancedImage(2, 1, 1, 1, 0, "top2.jpg");
		images[2] = new EnhancedImage(1, 0, 1, 1, 0, "top3.jpg");
		return images;
	}
}
