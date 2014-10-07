package pkg.revision.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import pkg.revision.domain.Seller;

@Entity 
@Table(name="ItemRevision")
public class Item implements Serializable {
	/**
	 * 
	 */
	@Id
	private long idItem;
	private String designation ;
	private float price;
	private static final long serialVersionUID = 4016825731674103168L;
	
	@OneToMany
	private List<Seller> serllerList;
	
	public Item() {
	}
	
	public Item(String designation, float price) {
		this.designation = designation;
		this.price = price;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	} 
	
}
