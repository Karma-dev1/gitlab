package org.example.model.dto;

public class RentAMovieDto
        extends BasedDto<Long> {

    private String demonstrationStartDate;
    private String demonstrationFinishDate;
    private String summa;
    private String tax;
    private FilmDto idFilm;
    private CinemaDto idCinema;

    // Геттеры и сеттеры для всех полей

    public String getDemonstrationStartDate() {
        return demonstrationStartDate;
    }

    public void setDemonstrationStartDate(String demonstrationStartDate) {
        this.demonstrationStartDate = demonstrationStartDate;
    }

    public String getDemonstrationFinishDate() {
        return demonstrationFinishDate;
    }

    public void setDemonstrationFinishDate(String demonstrationFinishDate) {
        this.demonstrationFinishDate = demonstrationFinishDate;
    }

    public String getSumma() {
        return summa;
    }

    public void setSumma(String summa) {
        this.summa = summa;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public FilmDto getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(FilmDto idFilm) {
        this.idFilm = idFilm;
    }

    public CinemaDto getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(CinemaDto idCinema) {
        this.idCinema = idCinema;
    }
}

