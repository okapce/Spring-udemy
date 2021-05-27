package com.example.springdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springdemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {


	//define entityManager
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired 
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	//@Transactional //will add service to handle tx
	public List<Employee> findAll() {
		// get current hibernate session
		Session currentSession = //sessionFactory.getCurrentSession();
								entityManager.unwrap(Session.class);
		
		// create query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		
		//execute query and get result list
		List<Employee> employees = theQuery.getResultList();

		//return results
		return employees;
	}


	@Override
	public Employee findById(int theId) {
		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//get employee
		Employee theEmployee = currentSession.get(Employee.class, theId);
		//return employee
		return theEmployee;
	}


	@Override
	public void save(Employee theEmployee) {
		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//get employee
		currentSession.saveOrUpdate(theEmployee);

	}


	@Override
	public void deleteById(int theId) {
		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		// create query
		Query theQuery = currentSession.createQuery(
				"delete from Employee where id=:employeeId");
		
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
				
		
	}

}
