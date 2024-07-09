package been;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMP_ID",nullable = false,unique = true)
	private long EMP_ID;
	
	
	private String Name;
	private long Salary;
	private Date joined_on;
	private String department;
	
//	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//	@JoinColumn(name="EMP_ID")
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="EMP_ID")
	private Employeedetails empDetails;

	
//	private List <Assetmngt> assetmngt;
//	
//	
//	public List<Assetmngt>getAssetmngt(){
//		return assetmngt;
//	}
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="EMP_ASSIGNMENTS",
	joinColumns= {@JoinColumn(name="EMP_ID")},
	inverseJoinColumns = {@JoinColumn(name="PR_ID")})
	private List<Projects> empAssignmentlist;
//	
	
	

	public List<Projects> getEmpAssignmentlist() {
		return empAssignmentlist;
	}
	public void setEmpAssignmentlist(List<Projects> empAssignmentlist) {
		this.empAssignmentlist = empAssignmentlist;
	}
	public Employeedetails getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(Employeedetails empDetails) {
		this.empDetails = empDetails;
	}
	public long getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(long eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	public Date getJoined_on() {
		return joined_on;
	}
	public void setJoined_on(Date joined_on) {
		this.joined_on = joined_on;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [EMP_ID=" + EMP_ID + ", Name=" + Name + ", Salary=" + Salary + ", joined_on=" + joined_on
				+ ", department=" + department + "]";
	}
//	public Employee(long eMP_ID, String name, long salary, Date joined_on, String department) {
//		super();
//		EMP_ID = eMP_ID;
//		Name = name;
//		Salary = salary;
//		this.joined_on = joined_on;
//		this.department = department;
//	}

	
	

}
