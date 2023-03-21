package com.classregister.school.repository;

import com.classregister.school.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InvoiceServiceRepository extends JpaRepository<Integer, Invoice> {
@Query(nativeQuery = true , value =  "select * from invoices where classs=:classId  and termId=:termId")
    public Integer checkDoubleBilling( String classId , Integer termId);


}
