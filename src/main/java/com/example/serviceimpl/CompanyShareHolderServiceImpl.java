package com.example.serviceimpl;

import com.example.bean.CompanyShareHolder;
import com.example.repository.CompanyShareHolderRepository;
import com.example.service.CompanyShareHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CompanyShareHolderServiceImpl implements CompanyShareHolderService {

    @Autowired
    CompanyShareHolderRepository companyShareHolderRepository;

    @Override
    public List<CompanyShareHolder> findAll() {
        return companyShareHolderRepository.findAll();
    }

    @Override
    public CompanyShareHolder findById(UUID id) {
        return companyShareHolderRepository.getOne(id);
    }

    @Override
    public CompanyShareHolder update(UUID id, CompanyShareHolder companyShareHolder) {
        companyShareHolder.getId();
        return companyShareHolderRepository.save(companyShareHolder);
    }

    @Override
    public CompanyShareHolder create(CompanyShareHolder companyShareHolder) {
        return companyShareHolderRepository.save(companyShareHolder);
    }

    @Override
    public void delete(UUID id) {
        companyShareHolderRepository.deleteById(id);
    }

}