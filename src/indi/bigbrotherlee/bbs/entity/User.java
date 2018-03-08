package indi.bigbrotherlee.bbs.entity;

import javax.persistence.*;

/**
 * 实体类User
 * 对应的表为user
 */
@Entity
@Table(name="user")
public class User {
	@Id //主键
	@GeneratedValue(strategy=GenerationType.AUTO)//主键生成方式
	private Integer id;
	
	@Column(name="name")//普通列（无依赖，非外键），对应列名为name
	private String name;
	
	@Column(name="password")//类推
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
