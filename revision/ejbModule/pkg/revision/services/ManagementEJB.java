package pkg.revision.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

import pkg.revision.domain.Item;

/**
 * Session Bean implementation class ManagementEJB
 */
@Stateful
@LocalBean
public class ManagementEJB implements ManagementEJBRemote, ManagementEJBLocal {
	
	List<Item> itemList = new ArrayList<Item>();
	private float totalPrice ;
    /**
     * Default constructor. 
     */
    public ManagementEJB() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public void addItem(Item item) {
		itemList.add(item);
		totalPrice += item.getPrice();
	}

	@Override
	public void resetCard() {
		itemList.clear();
		totalPrice =  0 ;
		
	}

	@Override
	public float getTotalprice() {
		
		return totalPrice;
	}

}
