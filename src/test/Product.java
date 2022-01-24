package test;

public class Product {
	
	public String prodName;
	public String prodDesc;
	public double prodPrice;
	public int prodQty;	
	
	public Product(String prodName, String prodDesc, double prodPrice, int prodQty) {
		super();
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	
	
	public void applyDiscount() {
		this.prodPrice=this.getProdPrice()*0.2;
	}
	
	

}
