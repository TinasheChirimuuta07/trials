package com.classregister.school.repository;

import com.classregister.school.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InvoiceServiceRepository extends JpaRepository<Invoice ,Integer > {
@Query(nativeQuery = true , value =  "select * from invoices where classs=:classId  and term_id=:termId")
    public List<Invoice> checkDoubleBilling(String classId , Integer termId);

//    @Query(nativeQuery = true , value =  "select * from invoices where classs=:classId  and termId=:termId")
//    public List<Invoice> retrieveAllFees(String classId , Integer termId);



}
