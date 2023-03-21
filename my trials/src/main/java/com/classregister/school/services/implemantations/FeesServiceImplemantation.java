package com.classregister.school.services.implemantations;

import com.classregister.school.exceptions.FeesnotfoundException;
import com.classregister.school.model.Fees;
import com.classregister.school.repository.FeesRepository;
import com.classregister.school.requestDTO.FeesrequestDTO;
import com.classregister.school.responseDTO.FeesresponseDTO;
import com.classregister.school.services.FeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor

public class FeesServiceImplemantation implements FeesService {

    @Autowired
    FeesRepository feesRepository ;
    @Override
    public FeesresponseDTO save(FeesrequestDTO feesrequestDTO) {
        Fees  newfees = new Fees() ;
        BeanUtils.copyProperties(feesrequestDTO,newfees);
     var savedfees=    feesRepository.save(newfees);
        FeesresponseDTO feesresponseDTO = new FeesresponseDTO();
        feesresponseDTO.setCode(700);
        feesresponseDTO.setMessage("Fees has been set Successfully ");
        feesresponseDTO.setFees(savedfees);
        return feesresponseDTO;
    }

    @Override
    public  Fees findwithid(Integer id) {
        return feesRepository.findById(id).orElseThrow(() -> new FeesnotfoundException("Fees with that id has not been found "));
    }

    @Override
    public FeesresponseDTO update( Integer id, FeesrequestDTO feesrequestDTO) {
       var fee = findwithid(id);
       if(!Objects.equals(id,feesrequestDTO.getId())){
           throw  new RuntimeException(" Fees id not found ");


       }
    //    Fees newfees = new Fees();
        BeanUtils.copyProperties(feesrequestDTO,fee);
        var saved = feesRepository.save(fee);



        FeesresponseDTO feesresponseDTO = new FeesresponseDTO();
       feesresponseDTO.setFees(saved);
        feesresponseDTO.setMessage("fees has been set  ");
feesresponseDTO.setCode(344);
        return  feesresponseDTO;
    }
}
