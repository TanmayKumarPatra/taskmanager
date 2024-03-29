package com.fse.cognizant.taskmanager.service;

import com.fse.cognizant.taskmanager.dao.ParentTask;
import com.fse.cognizant.taskmanager.repository.ParentTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentTaskService {
	
	@Autowired
	private ParentTaskRepository repo;
	
	public Iterable<ParentTask> getAllUsers() {
		return repo.findAll();
	}

	public ParentTask addNew(String task) {
		ParentTask ptask = new ParentTask();
		ptask.setParentTask(task);
		return repo.save(ptask);
	}
	

}
