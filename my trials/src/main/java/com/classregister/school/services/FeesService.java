package com.classregister.school.services;

import com.classregister.school.model.Fees;
import com.classregister.school.requestDTO.FeesrequestDTO;
import com.classregister.school.responseDTO.FeesresponseDTO;

public interface FeesService {
    public FeesresponseDTO save (FeesrequestDTO feesrequestDTO);
    Fees findwithid(Integer id );
   FeesresponseDTO update  (Integer id, FeesrequestDTO feesrequestDTO );
}

