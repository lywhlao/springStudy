package web.control;

import bean.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import persistence.UserDao;

@Controller
public class HomeController {


	@Autowired
	UserDao userDao;

	@RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
	public String home(Model model) {
		UserEntity userEntity=new UserEntity();
		userEntity.setPassword("aaa");
		userEntity.setUserName(Math.random()+"");
		userEntity.setEmail("ccc");
		userDao.insertUser(userEntity);
		System.out.print("---------");
		return "home";
	}

}
