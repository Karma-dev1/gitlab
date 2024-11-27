package org.example.controller;

import org.example.model.dto.CinemaDto;
import org.example.model.entity.CinemaEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.repository.CinemaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//sec commit
@RestController
@RequestMapping("cinema")
public class CinemaController
        implements ICrudController<CinemaDto, Long> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CinemaController.class);
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public List<CinemaDto> getAll() {
        LOGGER.info("IN getALL виконання запиту на отримання всіх кінотеатрів");
        List<CinemaEntity> entityList = cinemaRepository.findAll();
        List<CinemaDto> dtoList = new ArrayList<>(entityList.size());
        for (CinemaEntity entity : entityList)
            dtoList.add(buildDto(entity));
        return dtoList;
    }

    @Override
    public CinemaDto getById(Long id) {
        LOGGER.info("IN getById виконання запиту на отримання кінотеатру за ідентифікатором {}", id);
        CinemaDto dto = null;
        Optional<CinemaEntity> preloadOptional = cinemaRepository.findById(id);
        if (preloadOptional.isPresent())
            dto = buildDto(preloadOptional.get());
        return dto;
    }


    @Override
    public void deleteById(Long id) {
        LOGGER.info("IN deleteById виконання запиту на видалення кінотеатру за ідентифікатором {}", id);
        cinemaRepository.deleteById(id);
    }


    @Override
    public CinemaDto saveOrUpdate(@RequestBody CinemaDto dto) {
        LOGGER.info("IN saveOrUpdate виконання запиту на збереження/редагувания кінотеатру  {} {} {} {} {} {} {} {} {} {} {}",
                dto.getNameOfTheCinema(),
                dto.getAddressCinema(),
                dto.getDistrictOfTheCity(),
                dto.getDirectorOfTheCinema(),
                dto.getOwnerOfTheCinema(),
                dto.getBankCinema(),
                dto.getBankAccountNumber(),
                dto.getTelephoneNumberOfTheCinema(),
                dto.getAmountOfSeats(),
                dto.getPersonInCharge(),
                dto.getPhoneNumberOfThePersonInCharge());

        CinemaEntity preload;
        if (dto.getId() == null) {
            preload = new CinemaEntity();
        } else {
            Optional<CinemaEntity> preloadOptional = cinemaRepository.findById(dto.getId());
            preload = preloadOptional.orElseGet(CinemaEntity::new);
        }

        preload.setNameOfTheCinema(dto.getNameOfTheCinema());
        preload.setAddressCinema(dto.getAddressCinema());
        preload.setDistrictOfTheCity(dto.getDistrictOfTheCity());
        preload.setDirectorOfTheCinema(dto.getDirectorOfTheCinema());
        preload.setOwnerOfTheCinema(dto.getOwnerOfTheCinema());
        preload.setBankCinema(dto.getBankCinema());
        preload.setBankAccountNumber(dto.getBankAccountNumber());
        preload.setTelephoneNumberOfTheCinema(dto.getTelephoneNumberOfTheCinema());
        preload.setAmountOfSeats(dto.getAmountOfSeats());
        preload.setPersonInCharge(dto.getPersonInCharge());
        preload.setPhoneNumberOfThePersonInCharge(dto.getPhoneNumberOfThePersonInCharge());

        preload = cinemaRepository.save(preload);

        dto.setId(preload.getId());

        return dto;
    }
    private CinemaDto buildDto(CinemaEntity entity){
        CinemaDto dto = new CinemaDto();

        dto.setId(entity.getId());
        dto.setNameOfTheCinema(entity.getNameOfTheCinema());
        dto.setAddressCinema(entity.getAddressCinema());
        dto.setDistrictOfTheCity(entity.getDistrictOfTheCity());
        dto.setDirectorOfTheCinema(entity.getDirectorOfTheCinema());
        dto.setOwnerOfTheCinema(entity.getOwnerOfTheCinema());
        dto.setBankCinema(entity.getBankCinema());
        dto.setBankAccountNumber(entity.getBankAccountNumber());
        dto.setTelephoneNumberOfTheCinema(entity.getTelephoneNumberOfTheCinema());
        dto.setAmountOfSeats(entity.getAmountOfSeats());
        dto.setPersonInCharge(entity.getPersonInCharge());
        dto.setPhoneNumberOfThePersonInCharge(entity.getPhoneNumberOfThePersonInCharge());
        return dto;

    }

}



