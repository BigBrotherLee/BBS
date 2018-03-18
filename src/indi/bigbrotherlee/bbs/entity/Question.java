package indi.bigbrotherlee.bbs.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.Type;

@Entity
@Table(name="question")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="max_word")
	private int max_word;
	
	@Column(name="min_word")
	private int min_word;
	
	@Column(name="head")
	private String head;
	
	@Column(name="content")
	@Type(type="text")
	private String content;
	
	@Column(name="isAnonymous")
	private boolean isAnonymous;
	
	@Column(name="create_date")
	private Date create_date;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user_id;
	
	@OneToMany
	@JoinColumn(name="tag_id")
	private List<Tag> tag_id;
	
	@OneToMany
	@JoinColumn(name="classify_id")
	private Classify classify_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getMax_word() {
		return max_word;
	}

	public void setMax_word(int max_word) {
		this.max_word = max_word;
	}

	public int getMin_word() {
		return min_word;
	}

	public void setMin_word(int min_word) {
		this.min_word = min_word;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isAnonymous() {
		return isAnonymous;
	}

	public void setAnonymous(boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public List<Tag> getTag_id() {
		return tag_id;
	}

	public void setTag_id(List<Tag> tag_id) {
		this.tag_id = tag_id;
	}

	public Classify getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(Classify classify_id) {
		this.classify_id = classify_id;
	}
}
