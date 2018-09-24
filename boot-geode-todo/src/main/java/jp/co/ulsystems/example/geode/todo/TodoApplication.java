package jp.co.ulsystems.example.geode.todo;

import org.apache.geode.cache.RegionShortcut;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.PeerCacheApplication;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@SpringBootApplication
// @PeerCacheApplication(name = "TodoApplication", locators = "localhost[10334]")
@PeerCacheApplication(name = "TodoApplication")
@EnableGemfireRepositories
@EnableEntityDefinedRegions(basePackageClasses = TodoItem.class, serverRegionShortcut = RegionShortcut.PARTITION)
public class TodoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(TodoApplication.class)
				.web(WebApplicationType.SERVLET)
				.build()
				.run(args);
	}

//	@Profile("locator-manager")
//	@Configuration
//	@EnableLocator
//	@EnableManager(start = true)
//	static class LocatorManagerConfiguration {
//	}
}
