package com.damienfremont.blog.repository;

import com.damienfremont.blog.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created by DELL on 11/1/2018.
 */
public interface DataRepository extends PagingAndSortingRepository<Person, Serializable> {
}
