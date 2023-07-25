package model;

public class LineaDeProductos implements Comparable<LineaDeProductos> {

	private String productLine;
	private String textDescription;
	private String htmlDescription;
	private String image;

	public LineaDeProductos() {
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ProductoLinea [ProductLine=" + getProductLine() + ", TextDescription()=" + getTextDescription() + ", HtmlDescription=" + getHtmlDescription() + ", Image=" + getImage() + "]";
	}

	@Override
	public int compareTo(LineaDeProductos o) {
		return this.getProductLine().compareTo(o.getProductLine());
	}

}
