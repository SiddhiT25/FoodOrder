package com.foodorder.model;

public class Order {
    private String name;
    private String item;
    private int quantity;
    private int total;

    public Order(String name, String item, int quantity, int total) {
		super();
		this.name = name;
		this.item = item;
		this.quantity = quantity;
		this.total = total;
	}
	public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }
}
