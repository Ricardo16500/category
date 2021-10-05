package bo.edu.ucb.ingsoft.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestCategory {
    List<Category> categoryList = new ArrayList<>();

    @GetMapping(path="/task", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Category> listAll() {
        return categoryList;
    }

    @PostMapping(path="/task", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Category listAll(@RequestBody Category task) {
        categoryList.add(task);
        return task;
    }
}
