package com.vcube.empserviceportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employe71")
@Setter
@Getter

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer eid;
	 String fname;
	 String lname;
	 Integer age;
	 Double salary;
	 String city;
	 String state;

	 public Integer getEid() {
		return eid;
	}
	 public void setEid(Integer eid) {
		 this.eid = eid;
	 }
	 public String getFname() {
		 return fname;
	 }
	 public void setFname(String fname) {
		 this.fname = fname;
	 }
	 public String getLname() {
		 return lname;
	 }
	 public void setLname(String lname) {
		 this.lname = lname;
	 }
	 public Integer getAge() {
		 return age;
	 }
	 public void setAge(Integer age) {
		 this.age = age;
	 }
	 public Double getSalary() {
		 return salary;
	 }
	 public void setSalary(Double salary) {
		 this.salary = salary;
	 }
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 public String getState() {
		 return state;
	 }
	 public void setState(String state) {
		 this.state = state;
	 }

}
