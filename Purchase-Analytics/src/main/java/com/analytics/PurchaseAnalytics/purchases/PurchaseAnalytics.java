package com.analytics.PurchaseAnalytics.purchases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "purchase_analytics")
public class PurchaseAnalytics {
	
	@Id
	@SequenceGenerator(
			name = "purchase_sequence",
			sequenceName = "purchase_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "purchase_sequence"
			)
	
	private long id;
	private String name;
	private String passportNo;
	private String destination;
	private double price;
	private String purchaseDate;
	
	public PurchaseAnalytics() {
	}

	public PurchaseAnalytics(long id, String name, String passportNo, String destination, double price,
			String purchaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.passportNo = passportNo;
		this.destination = destination;
		this.price = price;
		this.purchaseDate = purchaseDate;
	}

	public PurchaseAnalytics(String name, String passportNo, String destination, double price, String purchaseDate) {
		super();
		this.name = name;
		this.passportNo = passportNo;
		this.destination = destination;
		this.price = price;
		this.purchaseDate = purchaseDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "PurchaseAnalytics [id=" + id + ", name=" + name + ", passportNo=" + passportNo + ", destination="
				+ destination + ", price=" + price + ", purchaseDate=" + purchaseDate + "]";
	}
	

}
