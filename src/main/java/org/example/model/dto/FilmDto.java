package org.example.model.dto;

import org.example.model.entity.ProviderEntity;

public class FilmDto extends BasedDto<Long> {
    private String nameOfTheMovie;
    private String author;
    private String shortMovieDescription;
    private String directorProducer;
    private String manufacturingCompany;
    private String yearOfPublication;
    private String productionCosts;
    private String purchasePrice;
    private Boolean presenceOfDuplication;


    public String getNameOfTheMovie() {
        return nameOfTheMovie;
    }

    public void setNameOfTheMovie(String nameOfTheMovie) {
        this.nameOfTheMovie = nameOfTheMovie;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShortMovieDescription() {
        return shortMovieDescription;
    }

    public void setShortMovieDescription(String shortMovieDescription) {
        this.shortMovieDescription = shortMovieDescription;
    }

    public String getDirectorProducer() {
        return directorProducer;
    }

    public void setDirectorProducer(String directorProducer) {
        this.directorProducer = directorProducer;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getProductionCosts() {
        return productionCosts;
    }

    public void setProductionCosts(String productionCosts) {
        this.productionCosts = productionCosts;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Boolean getPresenceOfDuplication() {
        return presenceOfDuplication;
    }

    public void setPresenceOfDuplication(Boolean presenceOfDuplication) {
        this.presenceOfDuplication = presenceOfDuplication;
    }

}
