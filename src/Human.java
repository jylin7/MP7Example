
public class Human {
	private String name;
	private int color;
	private int fabric;
	private int length; // short or long
	private int section; // upper or lower
	private int atmosphere; // formal or informal
	
	public Human(final String n) {
		name = n;
		color = 0;
		fabric = 0;
		length = 0;
		section = 0;
		atmosphere = 0;
	}
	
	public void add(EnhancedImage i) {
		color += i.getColor();
		fabric += i.getFabric();
		length += i.getLength();
		section += i.getSection();
		atmosphere += i.getAtmosphere();
	}
	
	public String toString() {
		String ans = "name: " + name + "\n\tcolor: " + color + "\n\tfabric: "
				+ fabric + "\n\tlength: " + length + "\n\tsection: "
				+ section + "\n\tatmosphere: " + atmosphere;
		return ans;
	}
	
	public String makeRecommendation(int n) {
		String c = getFinalColor(n);
		String f = getFinalFabric(n);
		String l = getFinalLength(n);
		String s = getFinalSection(n);
		String a = getFinalAtmosphere(n);
		String ans = "You should buy " + l + ", " + a + " " + s + " that are made of " + f
				+ " in the color " + c + ".";
		return ans;
	}
	
	public String getFinalColor(int num) {
		int c = color / num;
		String ans = "";
		if (c == 0) ans += "black";
		if (c == 1) ans += "white";
		if (c == 2) ans += "green"; 
		return ans;
	}
	public String getFinalFabric(int num) {
		int f = fabric / num;
		String ans = "";
		if (f == 0) ans += "cotton";
		if (f == 1) ans += "polyester";
		if (f == 2) ans += "nylon";
		return ans;
	}
	public String getFinalLength(int num) {
		int l = length / num;
		String ans = "";
		if (l == 0) ans += "short";
		if (l == 1) ans += "long";
		if (getFinalSection(num).equals("tops")) {
			ans += "-sleeved";
		}
		return ans;
	}
	public String getFinalSection(int num) {
		int s = section / num;
		String ans = "";
		if (s == 0) ans += "bottoms";
		if (s == 1) ans += "tops";
		return ans;
	}
	public String getFinalAtmosphere(int num) {
		int a = atmosphere / num;
		String ans = "";
		if (a == 0) ans += "informal";
		if (a == 1) ans += "formal";
		return ans;
	}
}
