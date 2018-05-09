package indi.bigbrotherlee.bbs.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name="comment")
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@ManyToMany
	@JoinColumn(name="auther_id")
	private List<User> auther_id;
	
	@Column(name="create_date")
	private Date create_date;
	
	@Column(name="isAnonymous")
	private boolean isAnonymous;
	
	@Column(name="comment")
	@Type(type="text")
	private String comment;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question_id;
	
	@ManyToOne
	@JoinColumn(name="essay_id")
	private Essay essay_id;
	
	@ManyToOne
	@JoinColumn(name="comment_id")
	private Comment comment_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<User> getAuther_id() {
		return auther_id;
	}
	public void setAuther_id(List<User> auther_id) {
		this.auther_id = auther_id;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public boolean isAnonymous() {
		return isAnonymous;
	}
	public void setAnonymous(boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Question getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Question question_id) {
		this.question_id = question_id;
	}
	public Essay getEssay_id() {
		return essay_id;
	}
	public void setEssay_id(Essay essay_id) {
		this.essay_id = essay_id;
	}
	public Comment getComment_id() {
		return comment_id;
	}
	public void setComment_id(Comment comment_id) {
		this.comment_id = comment_id;
	}
}
