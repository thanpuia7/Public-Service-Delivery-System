package com.puipuia.thymeleaf.helloworld1.Services;

import java.util.List;

import com.puipuia.thymeleaf.helloworld1.entities.Task;
import com.puipuia.thymeleaf.helloworld1.entities.User;
import com.puipuia.thymeleaf.helloworld1.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public void addTask(Task task, User user) {
		task.setUser(user);
		taskRepository.save(task);
	}
	
	public List<Task>  findUserTask(User user){
		
		return taskRepository.findByUser(user);
	}

}
