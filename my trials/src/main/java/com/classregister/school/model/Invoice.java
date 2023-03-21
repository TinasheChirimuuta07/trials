package com.classregister.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fees_id")
    private Integer feesId;
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "term_id")
    private Integer termId;
    @Column(name = "institution_id")
    private Integer institutionId;
    @Column(name = "invoice_date")
    private LocalDateTime invoiceDate;
    private BigDecimal amount;
    private String description;
    @Column(name = "invoice_number")
    private String invoiceNumber;
    private String classs;
    @Column(name = "created_by")
    private String createdBy;

    //Mapping issues
    private String school;
    private String student;

    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @PrePersist
    void init() {
        createdDate = LocalDateTime.now();
    }

    @PreUpdate
    void preUpdate() {
        updatedDate = LocalDateTime.now();
    }
}
