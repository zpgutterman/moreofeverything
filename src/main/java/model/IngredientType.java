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
 * IngredientType generated by hbm2java
 */
@Entity
@Table(name = "ingredient_type", catalog = "wecook")
public class IngredientType implements java.io.Serializable {

	private Integer id;
	private String type;
	private Set<Ingredient> ingredients = new HashSet<Ingredient>(0);

	public IngredientType() {
	}

	public IngredientType(String type) {
		this.type = type;
	}

	public IngredientType(String type, Set<Ingredient> ingredients) {
		this.type = type;
		this.ingredients = ingredients;
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

	@Column(name = "type", nullable = false, length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ingredientType")
	public Set<Ingredient> getIngredients() {
		return this.ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}