package br.com.raulmaciel.api_todolist.service;

import br.com.raulmaciel.api_todolist.entity.ToDo;
import br.com.raulmaciel.api_todolist.repository.ToDoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> create(ToDo toDo){
        toDoRepository.save(toDo);
        return list();
    }
    public List<ToDo> list(){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        return toDoRepository.findAll(sort);
    }
    public List<ToDo> update(ToDo toDo){
        toDoRepository.save(toDo);
        return list();
    }
    public List<ToDo> delete(Long id){
        toDoRepository.deleteById(id);
        return list();
    }
}
