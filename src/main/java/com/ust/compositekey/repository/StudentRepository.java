package com.ust.compositekey.repository;

import com.ust.compositekey.model.Student;
import com.ust.compositekey.model.StudentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, StudentKey> {
}
