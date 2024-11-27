package org.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cinemas")
public class CinemaEntity  extends BasedEntity<Long> {

    @Column(name = "name_of_the_cinema", length = 20)
    private String nameOfTheCinema;

    @Column(name = "address_cinema", length = 60)
    private String addressCinema;

    @Column(name = "district_of_the_city", length = 30)
    private String districtOfTheCity;

    @Column(name = "director_of_the_cinema", length = 60)
    private String directorOfTheCinema;

    @Column(name = "owner_of_the_cinema", length = 60)
    private String ownerOfTheCinema;

    @Column(name = "bank_cinema", length = 60)
    private String bankCinema;

    @Column(name = "bank_account_number", length = 20)
    private String bankAccountNumber;

    @Column(name = "telephone_number_of_the_cinema", length = 10)
    private String telephoneNumberOfTheCinema;

    @Column(name = "amount_of_seats")
    private String amountOfSeats;

    @Column(name = "person_in_charge", length = 60)
    private String personInCharge;

    @Column(name = "phone_number_of_the_person_in_charge", length = 10)
    private String phoneNumberOfThePersonInCharge;

    public String getNameOfTheCinema() {
        return nameOfTheCinema;
    }

    public void setNameOfTheCinema(String nameOfTheCinema) {
        this.nameOfTheCinema = nameOfTheCinema;
    }

    public String getAddressCinema() {
        return addressCinema;
    }

    public void setAddressCinema(String addressCinema) {
        this.addressCinema = addressCinema;
    }

    public String getDistrictOfTheCity() {
        return districtOfTheCity;
    }

    public void setDistrictOfTheCity(String districtOfTheCity) {
        this.districtOfTheCity = districtOfTheCity;
    }

    public String getDirectorOfTheCinema() {
        return directorOfTheCinema;
    }

    public void setDirectorOfTheCinema(String directorOfTheCinema) {
        this.directorOfTheCinema = directorOfTheCinema;
    }

    public String getOwnerOfTheCinema() {
        return ownerOfTheCinema;
    }

    public void setOwnerOfTheCinema(String ownerOfTheCinema) {
        this.ownerOfTheCinema = ownerOfTheCinema;
    }

    public String getBankCinema() {
        return bankCinema;
    }

    public void setBankCinema(String bankCinema) {
        this.bankCinema = bankCinema;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getTelephoneNumberOfTheCinema() {
        return telephoneNumberOfTheCinema;
    }

    public void setTelephoneNumberOfTheCinema(String telephoneNumberOfTheCinema) {
        this.telephoneNumberOfTheCinema = telephoneNumberOfTheCinema;
    }

    public String getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(String amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getPhoneNumberOfThePersonInCharge() {
        return phoneNumberOfThePersonInCharge;
    }

    public void setPhoneNumberOfThePersonInCharge(String phoneNumberOfThePersonInCharge) {
        this.phoneNumberOfThePersonInCharge = phoneNumberOfThePersonInCharge;
    }
}
