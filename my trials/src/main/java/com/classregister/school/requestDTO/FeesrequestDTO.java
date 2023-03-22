package com.classregister.school.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeesrequestDTO {
Integer id ;
    private String institutionId;
    private String classId;
    private String currency;
    private BigDecimal amount;
    private Integer termId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String createdBy;
    private String narration;
    private String status;

}
