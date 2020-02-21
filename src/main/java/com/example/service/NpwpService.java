package com.example.service;

import java.util.List;
import java.util.UUID;

import com.example.bean.Npwp;


public interface NpwpService {

    List<Npwp> findAll();

    Npwp findById(UUID id);

    Npwp update(UUID id, Npwp npwp);

    Npwp create(Npwp npwp);
    
    void delete(UUID id);
}