package com.classes;

import javax.persistence.*;  

@Entity  
@Table(name = "employee103")  
@Inheritance(strategy = InheritanceType.JOINED)  
  
public class Employee {  
@Id  
@GeneratedValue(strategy=GenerationType.TABLE)  
      
@Column(name = "id")  
private int id;  
  
@Column(name = "name")  
private String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}  



}  
