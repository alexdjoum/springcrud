package com.socialnetwork.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/***@Column(name="id")
	private int id;*/
	
    @Column(name="name") 
	private String name;
    @Column(name="email")
	private String email;
    /***@Column(name="valuePassword")
	private String password;*/
    /***@Column(name="valueProfilePicture")
	private String profilePicture;*/
    /***@Column(name="valueCoverPicture")
	private String coverPicture;*/
	//private int[] followers;
	//private int[] followings;
	//private boolean isAdmin = false;
	//private String city;
	//private String from;
	//private String desc;
	
	
	public User() {
		//super();
	}

	/**
	 * @return the id
	 */
	/***public int getId() {
		return id;
	}*/

	/**
	 * @param id the id to set
	 */
	/***public void setId(int id) {
		this.id = id;
	}*/

	/**
	 * @return the username
	 */
	public String getUsername() {
		return name;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.name = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	/***public String getPassword() {
		return password;
	}*/

	/**
	 * @param password the password to set
	 */
	/***public void setPassword(String password) {
		this.password = password;
	}*/

	/**
	 * @return the profilePicture
	 */
	/***public String getProfilePicture() {
		return profilePicture;
	}*/

	/**
	 * @param profilePicture the profilePicture to set
	 */
	/***public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}*/

	/**
	 * @return the coverPicture
	 */
	/***public String getCoverPicture() {
		return coverPicture;
	}*/

	/**
	 * @param coverPicture the coverPicture to set
	 */
	/***public void setCoverPicture(String coverPicture) {
		this.coverPicture = coverPicture;
	}*/

	/**
	 * @return the followers
	 */
	/***public int[] getFollowers() {
		return followers;
	}*/

	/**
	 * @param followers the followers to set
	 */
	/***public void setFollowers(int[] followers) {
		this.followers = followers;
	}*/

	/**
	 * @return the followings
	 */
	/***public int[] getFollowings() {
		return followings;
	}*/

	/**
	 * @param followings the followings to set
	 */
/***	public void setFollowings(int[] followings) {
		this.followings = followings;
	}*/

	/**
	 * @return the isAdmin
	 */
/***	public boolean isAdmin() {
		return isAdmin;
	}*/

	/**
	 * @param isAdmin the isAdmin to set
	 */
	/***public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}*/

	/**
	 * @return the city
	 */
/***	public String getCity() {
		return city;
	}*/

	/**
	 * @param city the city to set
	 */
/***	public void setCity(String city) {
		this.city = city;
	}*/

	/**
	 * @return the from
	 */
/***	public String getFrom() {
		return from;
	}*/

	/**
	 * @param from the from to set
	 */
/***	public void setFrom(String from) {
		this.from = from;
	}*/

	/**
	 * @return the desc
	 */
	/***public String getDesc() {
		return desc;
	}*/

	/**
	 * @param desc the desc to set
	 */
	/***public void setDesc(String desc) {
		this.desc = desc;
	};*/
	
	
	
}
