package org.bootstrap.project.conf;
 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.github.javarch.jsf.config.JavaServerFacesConfig;
import com.github.javarch.persistence.orm.hibernate.conf.DataSourceH2Config;
import com.github.javarch.persistence.orm.hibernate.conf.HibernateConfig;

@Configuration
@ComponentScan( basePackages = {
			"org.bootstrap",
			"com.github.javarch.support.log" // TODO Melhorar essa configuração.			
		},
		excludeFilters= { 
			@ComponentScan.Filter( Configuration.class ) 
		} )
@Import({
		DataSourceH2Config.class,
		HibernateConfig.class,
		JavaServerFacesConfig.class
		})
@ImportResource({
	"classpath*:/applicationContext-security.xml"
	})
public class AppConfig {

	 
}
