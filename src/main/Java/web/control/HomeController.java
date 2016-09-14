package web.control;

import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.session.ExpiringSession;
import org.springframework.session.data.redis.RedisOperationsSessionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import persistence.UserDao;

import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.time.*;

@Controller
public class HomeController {

	private static final Logger THIRDPARTY_LOG = LoggerFactory.getLogger("THIRDPARTY_LOGGER");


	@Value("${role}")
	String role;

	@Autowired
	UserDao userDao;

	@Autowired
	HttpSession httpSession;

	@Autowired
	RedisOperationsSessionRepository redisRepository;

	@RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		redisRepository.setDefaultMaxInactiveInterval(10);
		return "home";
	}

	@RequestMapping(value = {"/login"},method = RequestMethod.GET)
	public String login(@RequestParam("name")String name, @RequestParam("password")String password) {
		System.out.println("login"+name+","+password);
		return "home";
	}

	@RequestMapping(value = {"/test"},method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		THIRDPARTY_LOG.info("test>>>>>>>>>>>>");
		return "home";
	}
	@RequestMapping(value = {"/getTest"},method = RequestMethod.POST)
	@ResponseBody
	public String getTest() {
		THIRDPARTY_LOG.info("test>>>>>>>>>>>>"+role);
		return "home"+role;
	}

	@RequestMapping(value = {"/session"},method = RequestMethod.GET)
	@ResponseBody
	public String sessionTest() {
		httpSession.setAttribute("hello","bbb");
		return "home"+role;
	}
}
