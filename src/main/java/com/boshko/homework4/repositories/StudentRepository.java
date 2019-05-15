package com.boshko.homework4.repositories;

import com.boshko.homework4.entities.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student,Integer> {
//public interface StudentRepository extends CrudRepository<Student, Integer> {

    List<Student> findAllByScoreBetween(int min, int max);

    Student findOneByFirstName(String firstName);

    Iterable<Student> findAll(Sort sort);
}
