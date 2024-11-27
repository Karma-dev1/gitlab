package org.example.model.entity;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
public class BasedEntity <ID extends Number> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        BasedEntity<?> basedEntity = (BasedEntity<?>) o;
        return Objects.equals(id, basedEntity.id);
    }

    // Метод для вычисления хэш-кода объекта BasedDto
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
