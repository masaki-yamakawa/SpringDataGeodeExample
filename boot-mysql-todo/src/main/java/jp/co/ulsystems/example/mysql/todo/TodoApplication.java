package jp.co.ulsystems.example.mysql.todo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(TodoApplication.class)
		.web(WebApplicationType.SERVLET)
		.build()
		.run(args);
	}
}
