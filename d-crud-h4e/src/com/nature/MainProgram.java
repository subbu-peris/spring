package com.nature;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nature.model.Plant;
import com.nature.util.HibernateUtilities;

public class MainProgram {
	
	SessionFactory sessionFactory = HibernateUtilities.getSessionFactory();
	Session session = sessionFactory.openSession();

	public static void main(String[] args) {
		new MainProgram().performCRUD();
	}

	public void performCRUD() {
		savePlant();
		getPlants();
		updatePlant(2, "Updated!");
		deletePlant(3);

		session.close();
		sessionFactory.close();
	}

	private void savePlant() {
		session.beginTransaction();
		Plant plant = new Plant();
		plant.setName("PN2");
		plant.setCategory("Aquatic");
		plant.setDescription("Water Plant");
		plant.setPrice(50);
		session.save(plant);
		session.getTransaction().commit();
	}

	private void getPlants() {
		session.beginTransaction();
		Query selectQuery = session.createQuery("FROM Plant");
		List<Plant> plants = (List<Plant>) selectQuery.list();
		session.getTransaction().commit();
		for (Plant plant : plants) {
			System.out.println(plant);
		}
	}

	private void updatePlant(int id, String description) {
		session.beginTransaction();
		Plant plant = (Plant) session.get(Plant.class, id);
		plant.setDescription(description);
		session.getTransaction().commit();
	}

	private void deletePlant(int id) {
		session.beginTransaction();
		Plant plant = (Plant) session.get(Plant.class, id);
		session.delete(plant);
		session.getTransaction().commit();
	}

}
