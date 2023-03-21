package com.classregister.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Fees_table")
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer id;

    @Column(name = "name")
private String name ;
    @Column(name = "surname")
private String surname;
    @Column(name = "Institution_name")
private String institution;
    @Column(name = "new_fees")
private Integer fees;
    @Column(name = "todays_date")
private LocalDateTime createddate;
    @Column(name = "currency_used")
 private String currency;
    @Column(name = "narration")
 private String narration ;
    @Column(name = "creator")
 private String createdBy;

    @Column(name = "donebY")
    private String doneBy;



}
