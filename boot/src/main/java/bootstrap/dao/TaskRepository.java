package bootstrap.dao;

import org.springframework.data.repository.CrudRepository;


public interface TaskRepository extends CrudRepository<bootstrap.model.Task, Integer> {
	
}
