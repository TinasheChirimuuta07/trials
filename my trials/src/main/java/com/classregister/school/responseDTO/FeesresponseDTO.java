package com.classregister.school.responseDTO;

import com.classregister.school.model.Fees;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeesresponseDTO {
    private String message;
    private Integer code;
    private Fees fees;
}
