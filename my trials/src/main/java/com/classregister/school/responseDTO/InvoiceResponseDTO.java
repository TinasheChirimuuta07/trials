package com.classregister.school.responseDTO;

import com.classregister.school.model.Invoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceResponseDTO {
    private String message;
    private int code;
    private List<Invoice> invoiceList;

}
