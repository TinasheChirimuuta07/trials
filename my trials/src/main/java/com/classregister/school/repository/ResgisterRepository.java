package com.classregister.school.repository;


import com.classregister.school.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResgisterRepository extends JpaRepository<Register ,Integer > {


}

