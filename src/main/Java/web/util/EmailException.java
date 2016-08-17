package web.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.mail.MessagingException;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "NOT FOUND!!!")
public class EmailException extends MessagingException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
