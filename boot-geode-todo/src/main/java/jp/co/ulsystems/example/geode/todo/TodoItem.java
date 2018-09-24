package jp.co.ulsystems.example.geode.todo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Region("TodoItem")
@Getter
@Setter
@ToString
public class TodoItem {

	@Id
	private Long id;
	private String category;
	private String name;
	private boolean complete;
	private static final AtomicLong seq = new AtomicLong(0);

	public TodoItem() {
	}

	public TodoItem(String category, String name) {
		this.id = seq.incrementAndGet();
		this.category = category;
		this.name = name;
		this.complete = false;
	}
}