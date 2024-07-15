package Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class Base_Model {

    //Annotations will help to communicate b/w java code and SQL
    @Id // Tells that this attribute int id is Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private int id;

    @Column(name="CreatedAt")
    private LocalDateTime CreatedAt;

    private LocalDateTime UpdatedAt;
    private String CreatedBy;
    private String UpdatedBy;



}
