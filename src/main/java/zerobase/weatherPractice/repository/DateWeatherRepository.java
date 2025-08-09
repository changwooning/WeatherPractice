package zerobase.weatherPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.weatherPractice.domain.DateWeather;

import java.time.LocalDate;
import java.util.List;

public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {

    List<DateWeather> findAllByDate(LocalDate date);
}
