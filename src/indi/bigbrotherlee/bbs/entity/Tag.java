package indi.bigbrotherlee.bbs.entity;
import javax.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name="tag")
public class Tag {
	@Id //主键
	@GeneratedValue(strategy=GenerationType.AUTO)//主键生成方式
	private Integer id;
	
	@Column(name="name",unique=true)//名字唯一
	private String name;
	
	@Column(name="info")
	@Type(type="text")//标签说明为大文本
	private String info;
	
	@Column(name="isSystemTag")
	private boolean isSystemTag;
	
	@Column(name="inCheck")
	private boolean inCheck;
	
	@ManyToOne
	@JoinColumn(name="user_id")//单边多对一，user删除不会删除Tag，外键对应的列为user_id
	private User user_id;
	
	public boolean isInCheck() {
		return inCheck;
	}

	public void setInCheck(boolean inCheck) {
		this.inCheck = inCheck;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public boolean isSystemTag() {
		return isSystemTag;
	}

	public void setSystemTag(boolean isSystemTag) {
		this.isSystemTag = isSystemTag;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	
}
