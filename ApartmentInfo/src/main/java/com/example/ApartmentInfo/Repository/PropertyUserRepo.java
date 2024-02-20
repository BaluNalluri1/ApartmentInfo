package com.example.ApartmentInfo.Repository;

import com.example.ApartmentInfo.Model.Propertyuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyUserRepo extends JpaRepository<Propertyuser,Integer> {


}
