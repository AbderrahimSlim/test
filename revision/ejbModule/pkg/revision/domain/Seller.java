package pkg.revision.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity 
@Table(name="SellerRevision")
public class Seller implements Serializable {
	
	/**
	 * 
	 */
	
	@Id
	private long idSeller;
	private String name;
	private static final long serialVersionUID = 1L;
	
	public Seller() {
		super();
	}

	public long getIdSeller() {
		return idSeller;
	}

	public void setIdSeller(long idSeller) {
		this.idSeller = idSeller;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
