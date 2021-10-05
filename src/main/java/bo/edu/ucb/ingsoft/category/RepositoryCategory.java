package bo.edu.ucb.ingsoft.category;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categories", path = "category")
public interface RepositoryCategory extends PagingAndSortingRepository<Category, Integer> {

    
    List<Category> findByTitle(@Param("name") String name);
}
