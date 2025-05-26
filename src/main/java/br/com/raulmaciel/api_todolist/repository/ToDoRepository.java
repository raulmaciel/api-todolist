package br.com.raulmaciel.api_todolist.repository;

import br.com.raulmaciel.api_todolist.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
