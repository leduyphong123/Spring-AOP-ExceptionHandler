package com.codegym.aspect.repository;

import com.codegym.aspect.entity.Acount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcountRepository extends CrudRepository<Acount,Long> {
}
