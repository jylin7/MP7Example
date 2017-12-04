
public class EnhancedImage {
	private String source;
	private int color;
	private int fabric;
	private int length; // short or long
	private int section; // upper or lower
	private int atmosphere; // formal or informal
	private boolean like = false;
	
	public EnhancedImage(final int c, final int f, final int l, final int s,
			final int a, final String src) {
		color = c;
		fabric = f;
		length = l;
		section = s;
		atmosphere = a;
		source = src;
	}
	
	public int getColor() {
		return color;
	}
	public int getFabric() {
		return fabric;
	}
	public int getLength() {
		return length;
	}
	public int getSection() {
		return section;
	}
	public int getAtmosphere() {
		return atmosphere;
	}
	public String getSource() {
		return source;
	}
	public boolean getLiked() {
		return like;
	}
	public void likeImage() {
		like = true;
	}
}
