package com.classregister.school.controller;

import com.classregister.school.requestDTO.FeesrequestDTO;
import com.classregister.school.responseDTO.FeesresponseDTO;
import com.classregister.school.services.implemantations.FeesServiceImplemantation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class FeesController {
    @Autowired
    FeesServiceImplemantation feesServiceImplemantation ;
    @PostMapping("/save")
    public ResponseEntity<FeesresponseDTO> savefees( @RequestBody  FeesrequestDTO feesrequestDTO){
        return ResponseEntity.ok(feesServiceImplemantation.save(feesrequestDTO)) ;

    }
    @PutMapping("/update_fees/{id}")
    public ResponseEntity<FeesresponseDTO> update (@PathVariable Integer id, @RequestBody FeesrequestDTO feesrequestDTO  ){
        return  ResponseEntity.ok(feesServiceImplemantation.update(id,feesrequestDTO));


    }


}
