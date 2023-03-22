package com.classregister.school.controller;

import com.classregister.school.model.Register;
import com.classregister.school.model.Student;
import com.classregister.school.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentsController {
  @Autowired
  private StudentsService studentsservice ;

  //@GetMapping("/register/{id}")
 // public Student  getbyid ( @PathVariable("id")   Integer id ){return studentsservice.getbyid(id);}
  @PostMapping("/register")
  public Student saving (@RequestBody Student student){
    return studentsservice.saving(student);

  }


  @GetMapping("/get")
  public String get (){return "my name ";}


  @GetMapping("/register/{institution_id}/{classId}")
  public Register getRegister (@PathVariable("institution_id") Integer classid , @PathVariable("classId") Integer institution_id ){
    return studentsservice.getRegister( classid,institution_id);
  }
}
