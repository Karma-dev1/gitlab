package org.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "films")
public class FilmEntity extends BasedEntity<Long> {

    @Column(name = "name_of_the_movie", length = 30)
    private String nameOfTheMovie;

    @Column(name = "author", length = 60)
    private String author;

    @Column(name = "short_movie_description")
    private String shortMovieDescription;

    @Column(name = "director_producer", length = 60)
    private String directorProducer;

    @Column(name = "manufacturing_company", length = 40)
    private String manufacturingCompany;

    @Column(name = "year_of_publication")
    private Integer yearOfPublication;

    @Column(name = "production_costs")
    private Integer productionCosts;

    @Column(name = "purchase_price", length = 45)
    private String purchasePrice;

    @Column(name = "presence_of_duplication")
    private Boolean presenceOfDuplication;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_purveyor"/*, referencedColumnName = "id_provider"*/)
    private ProviderEntity purveyor;
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

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Integer getProductionCosts() {
        return productionCosts;
    }

    public void setProductionCosts(Integer productionCosts) {
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

    public ProviderEntity getPurveyor() {
        return purveyor;
    }

    public void setPurveyor(ProviderEntity purveyor) {
        this.purveyor = purveyor;
    }

}

