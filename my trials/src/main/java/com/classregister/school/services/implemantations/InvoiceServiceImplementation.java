package com.classregister.school.services.implemantations;

import com.classregister.school.model.Fees;
import com.classregister.school.model.Invoice;
import com.classregister.school.model.Student;
import com.classregister.school.repository.FeesRepository;
import com.classregister.school.repository.InvoiceServiceRepository;
import com.classregister.school.repository.StudentRepository;
import com.classregister.school.responseDTO.InvoiceResponseDTO;
import com.classregister.school.services.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImplementation  implements InvoiceService {
InvoiceResponseDTO invoiceResponseDTO ;
 private final  StudentRepository studentRepository;
 private final InvoiceServiceRepository invoiceServiceRepository;
 private final FeesRepository feesRepository;

    @Override
    public InvoiceResponseDTO classInvoiceGeneration(String createdBy, Integer termId, String classId, String schoolId) {

var doubleBilling = invoiceServiceRepository.checkDoubleBilling(classId , termId);
if (doubleBilling.size()>1){
    throw  new EntityNotFoundException("Invoice is already Generated ");
}

        var allStudents = studentRepository.findAll();
        if(allStudents.isEmpty()){
            throw  new EntityNotFoundException("No Students Found ");}
        var allFees = feesRepository.findAllFees( termId, classId);
        if(allFees.isEmpty())
        {
            throw new EntityNotFoundException("Fees with provided credential  is not available ");

        }
        {

for (Fees fees : allFees){
    for(Student student : allStudents){
        Invoice invoice = new Invoice();
        invoice.setCreatedBy(createdBy);
        invoice.setFeesId(fees.getId());
        invoice.setStudentId(student.getId());
       // invoice.setInstitutionId(String.valueOf(fees.getInstitutionId()));
        invoice.setTermId(termId);
        invoice.setInvoiceNumber(String.valueOf(System.currentTimeMillis()));
        invoice.setClasss(String.valueOf(student.getClasss()));
        invoice.setAmount(fees.getAmount());
      invoice.setDescription(fees.getNarration());
        invoice.setClasss(classId);
      invoice.setStudent(student.getStudentSurname());
        invoice.setSchool(student.getInstitution());

        invoiceServiceRepository.save(invoice);







    }

}

        }
        InvoiceResponseDTO responseDTO = new InvoiceResponseDTO();
        responseDTO.setMessage("Invoice has been Generated Succsesfully");
        responseDTO.setCode(200);
     //   responseDTO.setInvoiceList(in);

        return responseDTO;
}
}

