package com.camilagx.recifoodie.model;

import java.sql.Date;
import java.util.List;

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
	
	@OneToOne
	@JoinColumn(name="user_id")
	private RecifoodieUser user;

	@OneToMany
	@JoinTable(name="recipe_category",
			joinColumns = {@JoinColumn(name = "recipe_id")},
	    	inverseJoinColumns = {@JoinColumn(name = "category_id")}
	)
	private List<Category> category;
	
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
	public Date getDatePosted() {
		return datePosted;
	}
	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}
	public RecifoodieUser getUser() {
		return user;
	}
	public void setUser(RecifoodieUser user) {
		this.user = user;
	}
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", name=" + name + ", datePosted=" + datePosted + ", user=" + user
				+ ", category=" + category + "]";
	}
	
}