package com.classregister.school.model;

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
    @Column(name="classs")
    private Integer classs;
    @Column(name="institution")
    private String institution;
//    @ManyToOne
//    @JoinColumn(name = "classs",insertable = false, updatable = false)
//    private Classes classes;
    @Column(name="national_id")
    private String nationalId;

//    @OneToMany(fetch=FetchType.LAZY)
//    private Set<Receipt> receipts = new HashSet<>();
//    @OneToMany(fetch=FetchType.LAZY)
//    private Set<Invoice> invoices = new HashSet<>();
}
