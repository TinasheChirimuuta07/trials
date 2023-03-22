package com.classregister.school.services;

import com.classregister.school.responseDTO.InvoiceResponseDTO;

public interface InvoiceService {
public InvoiceResponseDTO classInvoiceGeneration ( String createdBy , Integer termId, String classId ,  String  schoolId );

}
