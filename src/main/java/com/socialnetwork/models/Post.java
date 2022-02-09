package com.socialnetwork.models;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="descrp")
	private String desc;
	
	@Column(name="img")
	private String img;
	
	@Column(name="likes")
	private int[] likes;
	
	@OneToMany(targetEntity = User.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id")
	private List<User> usersf;

	public Post() {
		//super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = (Long) id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int[] getLikes() {
		return likes;
	}

	public void setLikes(int[] likes) {
		this.likes = likes;
	}

	/**
	 * @return the usersf
	 */
	public List<User> getUsersf() {
		return usersf;
	}

	/**
	 * @param usersf the usersf to set
	 */
	public void setUsersf(List<User> usersf) {
		this.usersf = usersf;
	}
	
	
	
	
	

}
