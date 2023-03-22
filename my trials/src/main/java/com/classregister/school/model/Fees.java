
package com.classregister.school.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name="fees_structure")
public class Fees {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column(name="institution_id")
	private String institutionId;
	@Column(name="class_id")
	private String classId;

	@Column(name="currency")
	private String currency;

	@Column(name="amount")
	private BigDecimal amount;

	@Column(name="term_id")
	private Integer termId;
	@Column(name="created_date")
	private LocalDateTime createdDate;
	@Column(name="updated_date")
	private LocalDateTime updatedDate;
	@Column(name="createdBy")
	private String createdBy;
	@Column(name="narration")
	private String narration;
	private String status;


	@PrePersist
	void init(){
	createdDate=LocalDateTime.now();
	}
@PreUpdate
	void preUpdate(){
		updatedDate=LocalDateTime.now();
	}

}

