package com.example.serviceimpl;

import com.example.bean.Npwp;
import com.example.repository.NpwpRepository;
import com.example.service.NpwpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NpwpServiceImpl implements NpwpService {

    @Autowired
    NpwpRepository npwpRepository;

    @Override
    public List<Npwp> findAll() {
        return npwpRepository.findAll();
    }

    @Override
    public Npwp findById(UUID id) {
        return npwpRepository.getOne(id);
    }

    @Override
    public Npwp update(UUID id, Npwp npwp) {
        npwp.getId();
        return npwpRepository.save(npwp);
    }

    @Override
    public Npwp create(Npwp npwp) {
        return npwpRepository.save(npwp);
    }
    
    @Override
    public void delete(UUID id) {
        npwpRepository.deleteById(id);
    }

}