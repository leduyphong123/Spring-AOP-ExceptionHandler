package com.codegym.aspect.service.impl;

import com.codegym.aspect.entity.Acount;
import com.codegym.aspect.repository.AcountRepository;
import com.codegym.aspect.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AcountServiceImpl implements AcountService {
    @Autowired
    private AcountRepository acountRepository;
    @Override
    public List<Acount> getAll() {
        List<Acount> acountList = (List<Acount>) acountRepository.findAll();
        return acountList;
    }

    @Override
    public Acount getById(long id) {
        Acount acount = acountRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Not Id")
        );
        return acount;
    }
}
