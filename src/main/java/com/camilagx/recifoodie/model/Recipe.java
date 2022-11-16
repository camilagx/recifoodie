package com.camilagx.recifoodie.model;

import java.sql.Date;

import javax.persistence.*;

@Table
@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="recipe_id")
	private Long recipeId;
	
	@Column(name="recipe_name")
	private String name;
	
	@Column(name="date_posted")
	private Date datePosted;
	
	public Recipe() {
		super();
	}
	public Recipe(Long recipeId, String name, Date datePosted) {
		super();
		this.recipeId = recipeId;
		this.name = name;
		this.datePosted = datePosted;
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
	public Date getdatePosted() {
		return datePosted;
	}
	public void setdatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}
}