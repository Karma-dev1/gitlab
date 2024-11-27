package org.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "providers")
public class ProviderEntity extends BasedEntity<Long> {

    @Column(name = "name_of_the_purvey", length = 40)
    private String nameOfThePurvey;

    @Column(name = "address", length = 60)
    private String address;

    @Column(name = "bank_of_the_purvey", length = 60)
    private String bankOfThePurvey;

    @Column(name = "bank_account_number", length = 20)
    private String bankAccountNumber;

    @Column(name = "is_it_intermediary_company")
    private Boolean isItIntermediaryCompany;
    public String getNameOfThePurvey() {
        return nameOfThePurvey;
    }

    public void setNameOfThePurvey(String nameOfThePurvey) {
        this.nameOfThePurvey = nameOfThePurvey;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankOfThePurvey() {
        return bankOfThePurvey;
    }

    public void setBankOfThePurvey(String bankOfThePurvey) {
        this.bankOfThePurvey = bankOfThePurvey;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Boolean getIsItIntermediaryCompany() {
        return isItIntermediaryCompany;
    }

    public void setIsItIntermediaryCompany(Boolean isItIntermediaryCompany) {
        this.isItIntermediaryCompany = isItIntermediaryCompany;
    }
}