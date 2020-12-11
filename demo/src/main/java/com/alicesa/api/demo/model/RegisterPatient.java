package com.alicesa.api.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class RegisterPatient{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idRegisterPatient;
    private String fristnameLastname ;
    private Long idCard ;
    private String birthday;
    private String address;
    private String phone;

    public int getIdRegisterPatient() {
        return idRegisterPatient;
    }

    public void setIdRegisterPatient(int idRegisterPatient) {
        this.idRegisterPatient = idRegisterPatient;
    }

    public String getFristnameLastname() {
        return fristnameLastname;
    }

    public void setFristnameLastname(String fristnameLastname) {
        this.fristnameLastname = fristnameLastname;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}