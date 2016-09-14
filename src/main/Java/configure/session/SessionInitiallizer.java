package configure.session;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 *  ensure that our Servlet Container (i.e. Tomcat) uses our springSessionRepositoryFilter for every request.
 *  Fortunately, Spring Session provides a utility class
 *  named AbstractHttpSessionApplicationInitializer that makes this extremely easy.
 *
 * Created by hzlaojiaqi on 2016/9/14.
 */
public class SessionInitiallizer extends AbstractHttpSessionApplicationInitializer {

}
