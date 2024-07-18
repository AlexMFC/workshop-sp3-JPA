package com.studies.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studies.springbootcourse.entities.User;
import com.studies.springbootcourse.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> result = repository.findById(id);
		return result.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long Id) {
		repository.deleteById(Id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id); //diferente do findById nao acessa o banco de dados ainda, instancia o usuario e deixa monitorado pelo JPA
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}

}
