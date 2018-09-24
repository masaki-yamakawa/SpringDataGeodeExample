package jp.co.ulsystems.example.mysql.todo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TodoListViewModel {

	private List<TodoItem> todoList = null;

	public TodoListViewModel(List<TodoItem> todoList) {
		this.todoList = todoList;
	}
}