package io.swagger.application.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import com.parker.webservice.ServiceInit;
import io.swagger.jaxrs.config.BeanConfig;

/**
 * Servlet implementation class Bootstrap
 */
public class Bootstrap extends HttpServlet {


	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setTitle("MyParker APIs");
        //beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        //beanConfig.setHost("localhost:9999");
        beanConfig.setBasePath("/application");
        beanConfig.setResourcePackage(ServiceInit.class.getPackage().getName()+",org.apache.solr.handler.component");
        beanConfig.setScan(true);
	}

}
