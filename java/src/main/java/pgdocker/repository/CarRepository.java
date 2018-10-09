package pgdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pgdocker.domain.Car;

@Repository
public interface CarRepository  extends JpaRepository <Car, Long> {
}
