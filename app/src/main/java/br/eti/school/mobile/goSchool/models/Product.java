package br.eti.school.mobile.goSchool.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {

	private String name;

	private String description;

	private BigDecimal value;

	private BigDecimal quantity;

	///////////////////
	private List<Photo> photo;

	public Product(String name, String description, BigDecimal value, BigDecimal quantity) {
		this.name = name;
		this.description = description;
		this.value = value;
		this.quantity = quantity;
		this.photo = new ArrayList<Photo>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public List<Photo> getPhoto() {
		return photo;
	}

	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", value=" + value +
				", photo=" + photo +
				", quantity=" + quantity +
				'}';
	}
}
