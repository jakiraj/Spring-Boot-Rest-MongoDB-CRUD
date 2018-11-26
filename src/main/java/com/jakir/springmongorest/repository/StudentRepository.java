package com.jakir.springmongorest.repository;

import com.jakir.springmongorest.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findStudentByName(String name);
}
