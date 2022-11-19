package com.camilagx.recifoodie.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="feedback_id")
	private Long feedbackId;
	
	@Column
	private String text;
	
	@Column(name="date_posted")
	private Date datePosted;
	
	@Column
	private Double rating;
	
	public Feedback() {
	}
	public Feedback(Long feedbackId, String text, Date datePosted, Double rating) {
		this.feedbackId = feedbackId;
		this.text = text;
		this.datePosted = datePosted;
		this.rating = rating;
	}
	public Long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDatePosted() {
		return datePosted;
	}
	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", text=" + text + ", datePosted=" + datePosted + ", rating="
				+ rating + "]";
	}
	
}
