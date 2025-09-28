package springmvc.model;

import java.util.*;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Form {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
     private String name;
     private String email;
     @DateTimeFormat(pattern="YYYY-MM-DD")
     private Date date;
     private List<String> topics;
     private String gender;
     private String students;
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "address_id")
     public Address address;
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getTopics() {
		return topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getStudents() {
		return students;
	}
	public void setStudents(String students) {
		this.students = students;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Form [id=" + id + ", name=" + name + ", email=" + email + ", date=" + date + ", topics=" + topics
				+ ", gender=" + gender + ", students=" + students + ", address=" + address + "]";
	}
	
	
	
      
     
}
