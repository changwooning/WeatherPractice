package zerobase.weatherPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.weatherPractice.domain.DateWeather;

import java.time.LocalDate;

public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {
}
