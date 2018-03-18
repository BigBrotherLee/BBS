package indi.bigbrotherlee.bbs.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name="essay")
public class Essay {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="auther_id")
	private User auther_id;
	
	@Column(name="create_date")
	private Date create_date;
	
	@Column(name="comment")
	@Type(type="text")
	private String comment;
	
	@Column(name="status")
	private boolean status;
	
	@OneToMany
	@JoinColumn(name="tag_id")
	private List<Tag> tag_id;
	
	@OneToOne
	@JoinColumn(name="classify")
	private Classify classify_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getAuther_id() {
		return auther_id;
	}

	public void setAuther_id(User auther_id) {
		this.auther_id = auther_id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
