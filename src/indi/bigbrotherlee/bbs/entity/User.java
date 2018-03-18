package indi.bigbrotherlee.bbs.entity;

import java.util.Date;

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
	
	@Column(name="email")
	private String Email;
	
	@Column(name="real_name")
	private String real_name;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="interest")
	private String interest;
	
	@Column(name="brothday")
	private Date birthday;
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="education")
	private String education;
	
	@Column(name="honor_value")
	private int honor_value;
	
	@Column(name="self_comment")
	private String self_comment;
	//private Integer phone_number;//保留，电话号码，注册时再考虑

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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getHonor_value() {
		return honor_value;
	}

	public void setHonor_value(int honor_value) {
		this.honor_value = honor_value;
	}

	public String getSelf_comment() {
		return self_comment;
	}

	public void setSelf_comment(String self_comment) {
		this.self_comment = self_comment;
	}
}
