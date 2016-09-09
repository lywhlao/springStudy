package web.control;

import bean.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import persistence.UserDao;

@Controller
public class HomeController {

	private static final Logger THIRDPARTY_LOG = LoggerFactory.getLogger("THIRDPARTY_LOGGER");

	@Autowired
	UserDao userDao;

	@RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = {"/login"},method = RequestMethod.GET)
	public String login(@RequestParam("name")String name,@RequestParam("password")String password) {
		System.out.println("login"+name+","+password);
		return "home";
	}

	@RequestMapping(value = {"/test"},method = RequestMethod.POST)
	@ResponseBody
	public String test() {
		THIRDPARTY_LOG.info("test>>>>>>>>>>>>");
		return "home";
	}
	@RequestMapping(value = {"/getTest"},method = RequestMethod.GET)
	@ResponseBody
	public String getTest() {
		THIRDPARTY_LOG.info("test>>>>>>>>>>>>");
		return "home";
	}


}
