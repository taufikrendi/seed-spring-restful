package com.example.controller;

import com.example.bean.CompanyShareHolder;
import com.example.serviceimpl.CompanyShareHolderServiceImpl;
import com.example.util.Response;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "companyshareholder")
public class CompanyShareHolderController {

    @Autowired
    CompanyShareHolderServiceImpl companyShareHolderService;

    private String service = "CompanyShareHolder";

    @PostMapping
    ResponseEntity<Response> create (@RequestBody @Validated CompanyShareHolder companyShareHolder){

        Response response = new Response();
        response.setMessage("Success Data Input");

        response.setData(companyShareHolderService.create(companyShareHolder));

        return  ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PutMapping(value = "/{id}")
    ResponseEntity<Response> update (@PathVariable ("id")UUID id, @RequestBody @Validated CompanyShareHolder companyShareHolder){

        Response response = new Response();
        response.setMessage("Success Data Update");

        response.setData(companyShareHolderService.update(id, companyShareHolder));

        return  ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping(value = "/{id}")
    ResponseEntity<Response> getById (@PathVariable ("id")UUID id){

        Response response = new Response();
        response.setMessage("Berhasil Mengambil Data Berdasarkan Id");

        response.setData(companyShareHolderService.findById(id));

        return  ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping
    ResponseEntity<Response> findAll (){

        Response response = new Response();
        response.setMessage("Berhasil Menampilkan Seluruh Data");

        response.setData(companyShareHolderService.findAll());

        return  ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Response> deleteById (@PathVariable ("id")UUID id){

        Response response = new Response();
        response.setMessage("Data Berhasil dihapus");
        response.setData(companyShareHolderService.findById(id));

        companyShareHolderService.delete(id);

        return  ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }
}