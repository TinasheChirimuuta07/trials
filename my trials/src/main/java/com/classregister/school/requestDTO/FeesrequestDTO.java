package com.classregister.school.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeesrequestDTO {

    private Integer id;
    private String name ;
    private String surname;
    private String institution;
    private Integer fees;
    private LocalDateTime createddate;
    private String currency;

    private String narration ;

    private String createdby;


}
