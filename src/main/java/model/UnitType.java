package model;
// Generated Aug 22, 2016 2:10:35 PM by Hibernate Tools 4.3.4.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * UnitType generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "unit_type", uniqueConstraints = @UniqueConstraint(columnNames = "type"))
public class UnitType implements java.io.Serializable {

	private Integer unitTypeId;
	private String type;
	private Set<Unit> units = new HashSet<Unit>(0);

	public UnitType() {
	}

	public UnitType(String type) {
		this.type = type;
	}

	public UnitType(String type, Set<Unit> units) {
		this.type = type;
		this.units = units;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "unit_type_id", unique = true, nullable = false)
	public Integer getUnitTypeId() {
		return this.unitTypeId;
	}

	public void setUnitTypeId(Integer unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	@Column(name = "type", unique = true, nullable = false, length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unitType")
	public Set<Unit> getUnits() {
		return this.units;
	}

	public void setUnits(Set<Unit> units) {
		this.units = units;
	}

}
