package web.control;

import bean.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import persistence.UserDao;

@Controller
public class HomeController {


	@Autowired
	UserDao userDao;

	@RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
	public String home(@RequestParam("name")String name) {
		userDao.findUserByName(name).getEmail();
		return "home";
	}

	@RequestMapping(value = {"/login"},method = RequestMethod.GET)
	public String login(@RequestParam("name")String name,@RequestParam("password")String password) {
		System.out.println("login"+name+","+password);
		return "home";
	}

}
