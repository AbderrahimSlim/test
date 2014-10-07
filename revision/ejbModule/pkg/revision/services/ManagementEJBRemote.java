package pkg.revision.services;

import javax.ejb.Remote;

import pkg.revision.domain.Item;

@Remote
public interface ManagementEJBRemote {
	public void addItem(Item item);

	public void resetCard();

	public float getTotalprice();
}
