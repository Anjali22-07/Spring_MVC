package springmvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.UserDao;
import springmvc.model.Form;
import springmvc.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	public User createUser(User user) {
		
		return this.userDao.saveUser(user);    
		//as soon as createUser method is called --it calls the method saveUser from userDao class
	}
	
	public Form createForm(Form form) {
		
		return this.userDao.saveForm(form);
	}

}
