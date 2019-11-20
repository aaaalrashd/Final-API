package com.udacity.course3.reviews.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "COMMENTS")
public class CommentDocument {

	@Id
	private int _id;

	private String comment;

	public int getComemnt_id() {
		return _id;
	}

	public void setComemnt_id(int comemnt_id) {
		this._id = comemnt_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
