package bo.edu.ucb.ingsoft.category;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "category")
public class Category {
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;

    @Column(name="name")
    private String name;
    
    @Column(name="last_update")
    private Date last_update; 
    
    public Category(){
        
    }
    public Integer getCategoryId(){
        return category_id;
    }
    public void setCategoryId(Integer category_id) {
        this.category_id = category_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getLastUpdate() {
        return last_update;
    }
    public void setLastUpdate(Date last_update) {
        this.last_update = last_update;
    }
}
