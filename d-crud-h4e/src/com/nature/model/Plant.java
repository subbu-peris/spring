package com.nature.model;
public class Plant {
	private String category = null;
	private String description = null;
	private int id = 0;

	private String name = null;
	private int price = 0;
	/*public Plant() {
		
	}
	public Plant(String name, String category, String description, int price) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}*/
	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Plant [id=" + id + ", name=" + name + ", category=" + category + ", description=" + description
				+ ", price=" + price + "]";
	}

}
