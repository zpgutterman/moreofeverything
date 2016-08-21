package model;
// Generated Aug 21, 2016 5:21:33 PM by Hibernate Tools 4.3.4.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * History generated by hbm2java
 */
@Entity
@Table(name = "history", catalog = "wecook")
public class History implements java.io.Serializable {

	private Integer historyId;
	private int dishHistoryId;
	private Date cookDate;
	private int group;
	private Set<DishHistory> dishHistories = new HashSet<DishHistory>(0);

	public History() {
	}

	public History(int dishHistoryId, Date cookDate, int group) {
		this.dishHistoryId = dishHistoryId;
		this.cookDate = cookDate;
		this.group = group;
	}

	public History(int dishHistoryId, Date cookDate, int group, Set<DishHistory> dishHistories) {
		this.dishHistoryId = dishHistoryId;
		this.cookDate = cookDate;
		this.group = group;
		this.dishHistories = dishHistories;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "history_id", unique = true, nullable = false)
	public Integer getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}

	@Column(name = "dish_history_id", nullable = false)
	public int getDishHistoryId() {
		return this.dishHistoryId;
	}

	public void setDishHistoryId(int dishHistoryId) {
		this.dishHistoryId = dishHistoryId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cook_date", nullable = false, length = 19)
	public Date getCookDate() {
		return this.cookDate;
	}

	public void setCookDate(Date cookDate) {
		this.cookDate = cookDate;
	}

	@Column(name = "group", nullable = false)
	public int getGroup() {
		return this.group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "history")
	public Set<DishHistory> getDishHistories() {
		return this.dishHistories;
	}

	public void setDishHistories(Set<DishHistory> dishHistories) {
		this.dishHistories = dishHistories;
	}

}