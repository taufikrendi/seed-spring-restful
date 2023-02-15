package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

import java.util.UUID;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class CompanyShareHolder implements Serializable{

    @Id
    @Column(name="id")
    UUID id;

    @Column(name = "npwp_company")
    private String npwp_company;

    @Column(name = "company_name")
    private String company_name;

    @Column(name = "nik_share_holder")
    private String nik_share_holder;

    @Column(name = "name_share_holder")
    private String name_share_holder;

}