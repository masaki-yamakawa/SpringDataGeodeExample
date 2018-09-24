package jp.co.ulsystems.example.geode.todo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region("TodoItem")
public class TodoItem implements Serializable {

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

	@Override
	public String toString() {
		return String.format("TodoItem[id=%d, category='%s', name='%s', complete='%b']", id, category, name, complete);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		return;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
		return;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
		return;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
		return;
	}
}