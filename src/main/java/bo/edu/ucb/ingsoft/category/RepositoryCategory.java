package bo.edu.ucb.ingsoft.category;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
public interface RepositoryCategory extends PagingAndSortingRepository<Category, Integer> {

    
    List<Category> findByName(@Param("name") String title);
}
