package com.classregister.school.services.implemantations;

import com.classregister.school.model.Fees;
import com.classregister.school.model.Register;
import com.classregister.school.model.Student;
import com.classregister.school.repository.FeesRepository;
import com.classregister.school.repository.ResgisterRepository;
import com.classregister.school.repository.StudentRepository;
import com.classregister.school.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class Studentserviceimplemantation implements StudentsService {
    @Autowired
    private StudentRepository studentrepo;

    @Autowired
    private ResgisterRepository resgisterRepository;
    @Autowired
    private FeesRepository feesRepository;


    @Override
    public Student getbyid(Integer id) {
        return studentrepo.findAll().get(id);
    }

    @Override
    public Student saving(Student student) {
        return studentrepo.save(student);
    }

    @Override
    public Register getRegister(Integer classid , Integer institution_id) {

        List<Student> students = studentrepo.findAllByIdAndInstitution(classid, institution_id);
//System.out.println(students.size());

        for (Student student : students) {

            Register register = new Register();
            register.setStudentSurname(student.getStudentSurname());
            register.setStudentFirstName(student.getStudentFirstName());
            register.setClassId(student.getClasss());
            register.setInstitutionId(student.getInstitution());
            register.setAttendance(true);
            register.setDateTime(LocalDateTime.now());
            resgisterRepository.save(register);


        }
        return new Register();
    }



}
