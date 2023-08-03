package com.codegym.aspect.service;

import com.codegym.aspect.entity.Acount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AcountService {
   List<Acount> getAll();

   Acount getById(long id);
}
