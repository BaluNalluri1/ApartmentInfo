package com.example.ApartmentInfo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Propertyuser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    @NonNull
    private String uname;
    @NonNull
    private String uphone;


    @NonNull
    private String uemail;

    @NonNull
    private String password;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "addId")
    private Address address;


    @OneToMany(mappedBy = "propertyuser", cascade = CascadeType.ALL)
    private List<LeaseDetails> leaseDetails;

    @OneToMany(mappedBy = "propertyuser", cascade = CascadeType.ALL)
    private List<Payment> payments;

    public Propertyuser(String uname, String uphone, String uemail, String password, Address address) {
        this.uname = uname;
        this.uphone = uphone;
        this.uemail = uemail;
        this.password = password;
        this.address = address;
    }


}





//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "property_id")
//    private Property property;
//
//
