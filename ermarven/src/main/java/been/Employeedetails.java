package been;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_DETAILS")
public class Employeedetails {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="ED_ID",unique=true,nullable = false)
	private Long edid;
	private String address;
	private String gender;
	@Column(name="YEARS_OF_SERVICE")
	private Long yearsofservice;
	@Column(name="BANK_ACCOUNT")
	private String bankaccount;
	@Column(name="EMP_ID")
	private Long empid;
	
	
	
	public Long getEdid() {
		return edid;
	}
	public void setEdid(Long edid) {
		this.edid = edid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getYearsofservice() {
		return yearsofservice;
	}
	public void setYearsofservice(Long yearsofservice) {
		this.yearsofservice = yearsofservice;
	}
	public String getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employeedetails [edid=" + edid + ", address=" + address + ", gender=" + gender + ", yearsofservice="
				+ yearsofservice + ", bankaccount=" + bankaccount + ", empid=" + empid + "]";
	}
//	public Employeedetails(Long edid, String address, String gender, Long yearsofservice, String bankaccount,
//			Long empid) {
//		super();
//		this.edid = edid;
//		this.address = address;
//		this.gender = gender;
//		this.yearsofservice = yearsofservice;
//		this.bankaccount = bankaccount;
//		this.empid = empid;
//	}

}
