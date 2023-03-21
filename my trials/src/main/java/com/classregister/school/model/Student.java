package com.classregister.school.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Student")
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="student_first_name")
    private String studentFirstName;
    @Column(name="student_surname")
    private String studentSurname;

    private Integer classs;
  //  @ManyToOne

    //@JoinColumn(name="institution")
   // private Institution institution;
    private Integer institution;

    @Column(name="national_id")
    private String nationalId;


}
