package springmvc.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import springmvc.model.User;

@Repository      //this annotation ensures spring about this class being the database layer
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager entityManager;  //creating the object of HIbernateTemplate
	

	public User saveUser(User user) {
		
		// Get current session
        entityManager.persist(user);
		
		  //id- entity of the object is created
		return user;
	}
	

}
