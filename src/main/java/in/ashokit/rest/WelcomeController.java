package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	private Logger logger =LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		logger.info("getWelcomeMsg() execution started");
		String msg = "Hi Karan";
		logger.info("getWelcomeMsg() execution ended");
		return msg;

	}

}

	