package com.puipuia.thymeleaf.helloworld1.Repositories;

import java.util.List;

import com.puipuia.thymeleaf.helloworld1.entities.Task;
import com.puipuia.thymeleaf.helloworld1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user); 
	
}
