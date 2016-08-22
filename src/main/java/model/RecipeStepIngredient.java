package model;
// Generated Aug 22, 2016 2:10:35 PM by Hibernate Tools 4.3.4.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RecipeStepIngredient generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "recipe_step_ingredient")
public class RecipeStepIngredient implements java.io.Serializable {

	private Integer recipeStepIngredientId;
	private Ingredient ingredient;
	private Recipe recipe;
	private RecipeStep recipeStep;
	private Unit unit;
	private long quantity;

	public RecipeStepIngredient() {
	}

	public RecipeStepIngredient(Ingredient ingredient, Recipe recipe, RecipeStep recipeStep, Unit unit, long quantity) {
		this.ingredient = ingredient;
		this.recipe = recipe;
		this.recipeStep = recipeStep;
		this.unit = unit;
		this.quantity = quantity;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "recipe_step_ingredient_id", unique = true, nullable = false)
	public Integer getRecipeStepIngredientId() {
		return this.recipeStepIngredientId;
	}

	public void setRecipeStepIngredientId(Integer recipeStepIngredientId) {
		this.recipeStepIngredientId = recipeStepIngredientId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ingredient_id", nullable = false)
	public Ingredient getIngredient() {
		return this.ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recipe_id", nullable = false)
	public Recipe getRecipe() {
		return this.recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recipe_step_id", nullable = false)
	public RecipeStep getRecipeStep() {
		return this.recipeStep;
	}

	public void setRecipeStep(RecipeStep recipeStep) {
		this.recipeStep = recipeStep;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unit", nullable = false)
	public Unit getUnit() {
		return this.unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	@Column(name = "quantity", nullable = false, precision = 10, scale = 0)
	public long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}
