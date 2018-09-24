package jp.co.ulsystems.example.mysql.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class TodoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String category;
	private String name;
	private boolean complete;

	public TodoItem() {
	}

	public TodoItem(String category, String name) {
		this.category = category;
		this.name = name;
		this.complete = false;
	}
}