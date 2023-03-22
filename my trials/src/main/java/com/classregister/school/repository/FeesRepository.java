package com.classregister.school.repository;

import com.classregister.school.model.Fees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FeesRepository extends JpaRepository<Fees, Integer> {

    @Query(nativeQuery = true , value = " select * from fees_structure where term_id=:termId and class_id=:classId ")
    public List<Fees> findAllFees ( Integer termId ,  String classId );

}
