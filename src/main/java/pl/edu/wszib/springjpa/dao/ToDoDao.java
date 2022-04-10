package pl.edu.wszib.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.model.ToDo;

@Repository
public interface ToDoDao extends JpaRepository<ToDo, Integer> {
}
