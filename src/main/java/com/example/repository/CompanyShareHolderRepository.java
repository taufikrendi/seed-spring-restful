package com.example.repository;

import com.example.bean.CompanyShareHolder;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyShareHolderRepository extends JpaRepository<CompanyShareHolder, UUID> {

}