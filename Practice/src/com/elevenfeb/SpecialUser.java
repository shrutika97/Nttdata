package com.elevenfeb;
 
public class SpecialUser extends User {
	double discountOffer;
	
	public SpecialUser(String userName,double discountOffer) {
		super(userName);
		this.discountOffer=discountOffer;
	}
	void printDetailsOfSpecialUser() {
		System.out.println("Hello "+userName+" your Special User to our super Market and you have a special Discount Offer "+discountOffer+"%");
	}
}
