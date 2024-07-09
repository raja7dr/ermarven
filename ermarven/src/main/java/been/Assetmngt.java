package been;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset_mngt")
public class Assetmngt {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="am_ID",nullable = false,unique = true)
	private long am_Id;
	
	@Column(name="EMP_ID")
	private long EMP_ID;
	private String Asset_name;
	private String vendor;
	
	public Assetmngt(long am_Id, long eMP_ID, String asset_name, String vendor) {
		super();
		this.am_Id = am_Id;
		EMP_ID = eMP_ID;
		Asset_name = asset_name;
		this.vendor = vendor;
	}
	
	public long getAm_Id() {
		return am_Id;
	}
	public void setAm_Id(long am_Id) {
		this.am_Id = am_Id;
	}
	public long getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(long eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getAsset_name() {
		return Asset_name;
	}
	public void setAsset_name(String asset_name) {
		Asset_name = asset_name;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	@Override
	public String toString() {
		return "Assetmngt [am_Id=" + am_Id + ", EMP_ID=" + EMP_ID + ", Asset_name=" + Asset_name + ", vendor=" + vendor
				+ "]";
	}
	

}
