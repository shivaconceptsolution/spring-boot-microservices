package com.scs.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Student")
@Table(name = "tbl_student")
public class Student {
@Id
private int rno;
@Column
private String sname;
@Column
private String branch;
@Column
private int fees;
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}



}
