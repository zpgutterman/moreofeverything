/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import model.Dish;

@ApplicationScoped
@Transactional
public class DishDAO {

	@PersistenceContext(unitName = "more-of-everything")
	private EntityManager em;

	public Integer count() {
		Query query = em.createQuery("SELECT COUNT (d.id) FROM Dish d");
		return ((Long) query.getSingleResult()).intValue();
	}

	public List<Dish> findAllOrderedByName() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Dish> criteria = cb.createQuery(Dish.class);
		Root<Dish> dish = criteria.from(Dish.class);
		criteria.select(dish).orderBy(cb.asc(dish.get("name")));
		return em.createQuery(criteria).getResultList();
	}

	public Dish findById(int id) {
		Dish foundDish = em.find(Dish.class, id);
		return foundDish;
	}

	public void createDish(Dish dish) {
		//TODO implement
		
	}

	public void removeDish(Dish dish) {
		em.remove(em.merge(dish));		
	}

	
}