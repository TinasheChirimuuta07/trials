package com.classregister.school.controller;

import com.classregister.school.responseDTO.InvoiceResponseDTO;
import com.classregister.school.services.implemantations.InvoiceServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InvoiceController {
    private final  InvoiceServiceImplementation invoiceServiceImplementation;

    @GetMapping("/invoices/{createdBy}/{termId}/{classId}/{schoolId}")
    public ResponseEntity<InvoiceResponseDTO> generateClassInvoice(@PathVariable("createdBy") String createdBy,@PathVariable("termId") Integer termId, @PathVariable("classId")String classId,@PathVariable("schoolId") String schoolId){
return  ResponseEntity.ok(invoiceServiceImplementation.classInvoiceGeneration(createdBy,termId,classId,schoolId));

    }

}
