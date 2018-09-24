package jp.co.ulsystems.example.mysql.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

	@Autowired
	private TodoItemRepository repository;

	@RequestMapping("/")
	public String index(Model model) {
		List<TodoItem> todoList = (List<TodoItem>) repository.findAll();
		model.addAttribute("newitem", new TodoItem());
		model.addAttribute("items", new TodoListViewModel(todoList));
		return "index";
	}

	@RequestMapping("/create")
	public String addTodo(@ModelAttribute TodoItem requestItem) {
		TodoItem item = new TodoItem(requestItem.getCategory(), requestItem.getName());
		repository.save(item);
		return "redirect:/";
	}

	@RequestMapping("/update")
	public String updateTodo(@ModelAttribute TodoListViewModel requestItems) {
		for (TodoItem requestItem : requestItems.getTodoList()) {
			TodoItem item = new TodoItem(requestItem.getCategory(), requestItem.getName());
			item.setComplete(requestItem.isComplete());
			item.setId(requestItem.getId());
			repository.save(item);
		}
		return "redirect:/";
	}
}
