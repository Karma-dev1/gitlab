package org.example.model.dto;

public class ProviderDto extends BasedDto<Long> {
    private String idProvider;
    private String nameOfThePurvey;
    private String address;
    private String bankOfThePurvey;
    private String bankAccountNumber;
    private Boolean isItIntermediaryCompany;

    // Геттеры и сеттеры для всех полей
    public String getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(String idProvider) {
        this.idProvider = idProvider;
    }

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
