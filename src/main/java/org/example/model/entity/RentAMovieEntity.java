package org.example.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "rent_a_movies")
public class RentAMovieEntity extends BasedEntity<Long> {

    @Column(name = "demonstration_start_date")
    private LocalDate demonstrationStartDate;

    @Column(name = "demonstration_finish_date")
    private LocalDate demonstrationFinishDate;

    @Column(name = "summa", length = 15)
    private BigDecimal summa;

    @Column(name = "tax", length = 15)
    private BigDecimal tax;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_film"/*, referencedColumnName = "id_film"*/)
    private FilmEntity idfilm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cinema"/*, referencedColumnName = "id_cinema"*/)
    private CinemaEntity idcinema;


    public LocalDate getDemonstrationStartDate() {
        return demonstrationStartDate;
    }

    public void setDemonstrationStartDate(LocalDate demonstrationStartDate) {
        this.demonstrationStartDate = demonstrationStartDate;
    }

    public LocalDate getDemonstrationFinishDate() {
        return demonstrationFinishDate;
    }

    public void setDemonstrationFinishDate(LocalDate demonstrationFinishDate) {
        this.demonstrationFinishDate = demonstrationFinishDate;
    }

    public BigDecimal getSumma() {
        return summa;
    }

    public void setSumma(BigDecimal summa) {
        this.summa = summa;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public FilmEntity getIdfilm() {
        return idfilm;
    }

    public void setIdfilm(FilmEntity idfilm) {
        this.idfilm = idfilm;
    }

    public CinemaEntity getIdcinema() {
        return idcinema;
    }

    public void setIdcinema(CinemaEntity idcinema) {
        this.idcinema = idcinema;
    }
}

