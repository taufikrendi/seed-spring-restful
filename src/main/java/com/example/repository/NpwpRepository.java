package com.example.repository;

import com.example.bean.Npwp;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NpwpRepository extends JpaRepository<Npwp, UUID> {

}