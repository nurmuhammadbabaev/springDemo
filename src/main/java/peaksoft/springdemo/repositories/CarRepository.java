package peaksoft.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.springdemo.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car,Long> {
    @Override
    default List<Car> findAll() {
        return null;
    }

    @Override
    default <S extends Car> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Car> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default void deleteById(Long aLong) {

    }
}
