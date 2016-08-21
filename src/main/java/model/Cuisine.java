package model;
// Generated Aug 21, 2016 5:21:33 PM by Hibernate Tools 4.3.4.Final

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

/**
 * Cuisine generated by hbm2java
 */
@Entity
@Table(name = "cuisine", catalog = "wecook")
public class Cuisine implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<Dish> dishes = new HashSet<Dish>(0);

	public Cuisine() {
	}

	public Cuisine(String name) {
		this.name = name;
	}

	public Cuisine(String name, Set<Dish> dishes) {
		this.name = name;
		this.dishes = dishes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuisine")
	public Set<Dish> getDishes() {
		return this.dishes;
	}

	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}

}
