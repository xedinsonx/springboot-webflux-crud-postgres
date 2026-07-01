package com.crudemployee.CRUD.Entidad;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("employees")
public class Employee {
    @Id
    private Long id;
    private String name;
    private String role;
}
