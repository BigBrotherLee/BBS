package indi.bigbrotherlee.bbs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class CareAbout {
	@Id
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="user_id")
	private User user_id;
	@OneToMany
	@JoinColumn(name="care_about_users")
	private List<User> care_about_users;
	@OneToMany
	@JoinColumn(name="collect_essaies")
	private List<Essay> collect_essaies;
	@OneToMany
	@JoinColumn(name="collect_answers")
	private List<Comment> collect_answers;
	@OneToMany
	@JoinColumn(name="care_about_questions")
	private List<Question> care_about_questions;
	
	public User getUser() {
		return user_id;
	}
	public void setUser(User user) {
		this.user_id = user;
	}
	public List<User> getCare_about_users() {
		return care_about_users;
	}
	public void setCare_about_users(List<User> care_about_users) {
		this.care_about_users = care_about_users;
	}
	public List<Essay> getCollect_essay() {
		return collect_essaies;
	}
	public void setCollect_essay(List<Essay> collect_essay) {
		this.collect_essaies = collect_essay;
	}
	public List<Comment> getCollect_answers() {
		return collect_answers;
	}
	public void setCollect_answers(List<Comment> collect_answers) {
		this.collect_answers = collect_answers;
	}
	public List<Question> getCare_about_questions() {
		return care_about_questions;
	}
	public void setCare_about_questions(List<Question> care_about_questions) {
		this.care_about_questions = care_about_questions;
	}
}
 