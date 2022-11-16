package com.camilagx.recifoodie.model;

import java.sql.Date;

public class Recipe {
	private Long recipeId;
	private String name;
	private Date postedDate;
	private String categoryId;
	
	public Recipe() {
		super();
	}
	public Recipe(Long recipeId, String name, Date postedDate, String categoryId) {
		super();
		this.recipeId = recipeId;
		this.name = name;
		this.postedDate = postedDate;
		this.categoryId = categoryId;
	}
	public Long getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", name=" + name + ", postedDate=" + postedDate + ", categoryId="
				+ categoryId + "]";
	}
}