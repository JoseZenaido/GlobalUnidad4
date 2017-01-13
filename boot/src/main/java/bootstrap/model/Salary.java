package bootstrap.model;

import java.io.Serializable;

import java.util.Date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="salaries")
public class Salary implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emNo;
	@Column(name="salary")
	private int salary;
	@Temporal(TemporalType.DATE)
	@Column(name="from_date")
	private Date fromDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="to_date")
	private Date toDate;
	
	public Salary(int salary, Date froDate, Date toDate){
		super();
		this.salary=salary;
		this.fromDate=froDate;
		this.toDate=toDate;
		
	}
	public Salary(){
		this(0,new Date(), new Date());
	}



	
	
	public int getEmNo() {
		return emNo;
	}
	public void setEmNo(int emNo) {
		this.emNo = emNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "Salary [emNo=" + emNo + ", salario=" + salary + ", fromDate="
				+ fromDate + ", toDate=" + toDate + "]";
	}
	
	
}
