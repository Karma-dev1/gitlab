package org.example.controller;

import org.example.model.dto.FilmDto;
import org.example.model.entity.FilmEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("film")
public class FilmController
        implements ICrudController<FilmDto, Long> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FilmController.class);
    @Autowired
    private org.example.repository.FilmRepository filmRepository;


    @Override
    public List<FilmDto> getAll () {
        LOGGER.info("IN getALL виконання запиту на отримання всіх фільмів");
        List<FilmEntity> entityList = filmRepository.findAll();
        List<FilmDto> dtoList = new ArrayList<>(entityList.size());
        for (FilmEntity entity : entityList)
            dtoList.add(buildDto(entity));
        return dtoList;
    }

    @Override
    public FilmDto getById(Long id) {
        LOGGER.info("IN getById виконання запиту на отримання фільму за ідентифікатором {}", id);
        FilmDto dto = null;
        Optional<FilmEntity> preloadOptional = filmRepository.findById(id);
        if (preloadOptional.isPresent())
            dto = buildDto(preloadOptional.get());
        return dto;
    }


    @Override
    public void deleteById (Long id){
        LOGGER.info("IN deleteById } виконання запиту на видалення фільму за ідентифікатором {}", id);
        filmRepository.deleteById(id);
    }

    @Override
    public FilmDto saveOrUpdate (FilmDto dto){
        LOGGER.info("IN saveOrUpdate виконання запиту на збереження/редагувания фільму {} {} {} {} {} {} {} {} {}",  dto.getNameOfTheMovie(), dto.getAuthor(), dto.getShortMovieDescription(),
                dto.getDirectorProducer(), dto.getManufacturingCompany(), dto.getYearOfPublication(), dto.getProductionCosts(),dto.getPurchasePrice(), dto.getPresenceOfDuplication());
        FilmEntity preload;
        if (dto.getId() == null) {
            preload = new FilmEntity();
        } else {
            Optional<FilmEntity> preloadOptional = filmRepository.findById(dto.getId());
            preload = preloadOptional.orElseGet(FilmEntity::new);
        }

        preload.setNameOfTheMovie(dto.getNameOfTheMovie());

        preload.setAuthor(dto.getAuthor());

        preload.setShortMovieDescription(dto.getShortMovieDescription());

        preload.setDirectorProducer(dto.getDirectorProducer());

        preload.setManufacturingCompany(dto.getManufacturingCompany());

        preload.setYearOfPublication(Integer.valueOf(dto.getYearOfPublication()));

        preload.setProductionCosts(Integer.valueOf(dto.getProductionCosts()));

        preload.setPurchasePrice(dto.getPurchasePrice());

        preload.setPresenceOfDuplication(dto.getPresenceOfDuplication());

        preload = filmRepository.save(preload);

        dto.setId(preload.getId());

        return dto;
    }

    private FilmDto buildDto(FilmEntity entity){
        FilmDto dto = new FilmDto();

        dto.setId(entity.getId());
        dto.setNameOfTheMovie(entity.getNameOfTheMovie());
        dto.setAuthor(entity.getAuthor());
        dto.setShortMovieDescription(entity.getShortMovieDescription());
        dto.setDirectorProducer(entity.getDirectorProducer());
        dto.setManufacturingCompany(entity.getManufacturingCompany());
        dto.setYearOfPublication(String.valueOf(entity.getYearOfPublication()));
        dto.setProductionCosts(String.valueOf(entity.getProductionCosts()));
        dto.setPurchasePrice(entity.getPurchasePrice());
        dto.setPresenceOfDuplication(entity.getPresenceOfDuplication());
        return dto;

    }
}