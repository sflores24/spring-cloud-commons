package mx.com.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class }) // This exclude it's for avoid errors on JPA
// because it want's to connecto to DB
public class SpringbootServicioCommonsApplication {

	// Remove main method because is for library this project

}
