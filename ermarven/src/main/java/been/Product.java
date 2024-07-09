package been;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	
	@Id
	private int P_Id;
	private String P_Name;
	private int Price;
	
	public int getP_Id() {
		return P_Id;
	}
	public void setP_Id(int p_Id) {
		P_Id = p_Id;
	}
	public String getP_Name() {
		return P_Name;
	}
	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Product(int p_Id, String p_Name, int price) {
		super();
		P_Id = p_Id;
		P_Name = p_Name;
		Price = price;
	}

	@Override
	public String toString() {
		return "Product [P_Id=" + P_Id + ", P_Name=" + P_Name + ", Price=" + Price + "]";
	}


}
