package com.example.ApartmentInfo.Controller;

import com.example.ApartmentInfo.DTO.PropertyRequestDTO;
import com.example.ApartmentInfo.Model.Propertyuser;
import com.example.ApartmentInfo.Service.PropertyuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyuserController {
   @Autowired
   private PropertyuserService propertyuserService;



    @PostMapping("/create")
    public ResponseEntity<String> createProperty(@RequestBody PropertyRequestDTO propertyRequestDTO) {
        propertyuserService.createProperty(propertyRequestDTO);
        return ResponseEntity.ok("Property, owner, and address created successfully."+propertyRequestDTO);

    }

}


//    @GetMapping("/propertyuser")
//    public Propertyuser saveUser(@RequestBody Propertyuser propertyuser){
//        return propertyuserService.c(propertyuser);
//    }