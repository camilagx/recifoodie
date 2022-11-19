package com.camilagx.recifoodie.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class RecifoodieUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;
	
	@Column(unique=true, name="username")
	private String username;
	
	@Column
	private String password;

	@Column(unique = true, name="email")
	private String email;
	
	//if user is deleted, all recipes will also be deleted
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_recipes",
	joinColumns = {@JoinColumn(name = "user_id")},
    	inverseJoinColumns = {@JoinColumn(name = "recipe_id")}
	)
	private List<Recipe> recipes;
	
	public RecifoodieUser() {
	}
	public RecifoodieUser(Long userId, String username, String password, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
	@Override
	public String toString() {
		return "RecifoodieUser [userId=" + userId + ", username=" + username + ", password=" + password + ", email="
				+ email + ", recipes=" + recipes + "]";
	}
}
