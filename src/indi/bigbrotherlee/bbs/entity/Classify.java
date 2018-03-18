package indi.bigbrotherlee.bbs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name="classify")
public class Classify {
	@Id //主键
	@GeneratedValue(strategy=GenerationType.AUTO)//主键生成策略
	private Integer id;
	
	@Column(name="name",unique=true)//名字唯一
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="father_id")//单边多对一
	private Classify father_id;
	
	@Column(name="info")
	@Type(type="text")
	private String info;

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

	public Classify getFather_id() {
		return father_id;
	}

	public void setFather_id(Classify father_id) {
		this.father_id = father_id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
