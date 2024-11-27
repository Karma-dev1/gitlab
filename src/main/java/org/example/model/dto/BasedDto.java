package org.example.model.dto;

import java.util.Objects;

public class BasedDto<ID> {
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    // Метод для сравнения объектов BasedDto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasedDto<?> basedDto = (BasedDto<?>) o;
        return Objects.equals(id, basedDto.id);
    }

    // Метод для вычисления хэш-кода объекта BasedDto
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

