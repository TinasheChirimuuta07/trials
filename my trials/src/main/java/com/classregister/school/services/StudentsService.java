package com.classregister.school.services;

import com.classregister.school.model.Register;
import com.classregister.school.model.Student;

public interface StudentsService {


    Student getbyid(Integer id);

    Student saving(Student student);

    Register getRegister(Integer institution_id, Integer classId);
}



