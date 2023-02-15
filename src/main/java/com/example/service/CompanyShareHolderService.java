package com.example.service;

import java.util.List;
import java.util.UUID;

import com.example.bean.CompanyShareHolder;

public interface CompanyShareHolderService {

    List<CompanyShareHolder> findAll();

    CompanyShareHolder findById(UUID id);

    CompanyShareHolder update(UUID id, CompanyShareHolder companyShareHolder);

    CompanyShareHolder create(CompanyShareHolder companyShareHolder);

    void delete(UUID id);
}