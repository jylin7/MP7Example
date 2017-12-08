
public class EnhancedImage {
	/** The image url source. */
	private String source;
	/** The specific key that stores information about the item, explained in the key file. */
	private String key;
	/** The color of the item. */
	private String color;
	/** The style of the item, for example: t-shirt, dress shirt, long pants, shorts, etc. */
	private String style;
	/** Whether the user likes the item or not. */
	private boolean like = false;
	
	/**
	 * Creates an image with a key that specifies it from other items.
	 * @param gender if the article of clothing is for men or women
	 * @param atmosphere if the article is formal or informal
	 * @param section if the article is for your upper half or lower half
	 * @param style determines if the article is shorts, pants, t-shirts, long sleeved, etc.
	 * @param color the color of the article of clothing
	 * @param src the image url to display the image
	 */
	public EnhancedImage(final String gender, final String atmosphere, final String section,
			final String style, final String color, final String src) {
		key = gender + atmosphere + section;
		this.style = style;
		this.color = color;
		source = src;
	}
	
	/**
	 * Returns the color of the item.
	 * @return the color of the item
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Returns the key of the item.
	 * @return the key of the item
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * Returns the style of the item.
	 * @return the style of the item
	 */
	public String getStyle() {
		return style;
	}
	
	/**
	 * Returns the image source of the item
	 * @return the image source of the item
	 */
	public String getSource() {
		return source;
	}
	
	/**
	 * Returns true if the item was liked, false if not.
	 * @return true if the item was liked, false if not
	 */
	public boolean getLiked() {
		return like;
	}
	
	/**
	 * Sets the like instance variable to true if the user likes the item.
	 */
	public void likeImage() {
		like = true;
	}
	
	/**
	 * To string method to represent the image.
	 */
	public String toString() {
		return "Source: " + source + "\nKey: " + key + "\nColor: " + color
				+ "\nStyle: " + style + "\nLiked: " + like;
	}
}
