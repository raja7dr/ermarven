package been;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROJECTS")
public class Projects {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="ED_ID",unique=true,nullable = false)
	private Long prid;
	private String name;
	private String owner;
	
	@ManyToMany(mappedBy ="empAssignmentlist")
	
	public Long getPrid() {
		return prid;
	}
	public void setPrid(Long prid) {
		this.prid = prid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Projects [prid=" + prid + ", name=" + name + ", owner=" + owner + "]";
	}
	

}
