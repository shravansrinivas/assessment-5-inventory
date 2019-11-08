package inventory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products_list")
public class Product {
public Product() {
		super();
	}
@Id
@GeneratedValue
private int productId;
private String productName;
private String desc;
private int size,quantity;
public Product(int productId, String productName, String desc, int size, int quantity) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.desc = desc;
	this.size = size;
	this.quantity = quantity;
}
public Product(String productName, String desc, int size, int quantity) {
	super();
	this.productName = productName;
	this.desc = desc;
	this.size = size;
	this.quantity = quantity;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", desc=" + desc + ", size=" + size
			+ ", quantity=" + quantity + "]";
}


}
