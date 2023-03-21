package com.classregister.school.services.implemantations;

import com.classregister.school.repository.FeesRepository;
import com.classregister.school.repository.InvoiceServiceRepository;
import com.classregister.school.repository.StudentRepository;
import com.classregister.school.responseDTO.InvoiceResponseDTO;
import com.classregister.school.services.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImplementation  implements InvoiceService {
 private final  StudentRepository studentRepository;
 private final InvoiceServiceRepository invoiceServiceRepository;
 private final FeesRepository feesRepository;

    @Override
    public InvoiceResponseDTO classInvoiceGeneration(String createdBy, Integer termId, String classId, Integer schoolId) {

        var allStudents = studentRepository.findAll();
        if(allStudents.isEmpty()){
            throw  new EntityNotFoundException("No Students Found ");}



        return null;
}}
