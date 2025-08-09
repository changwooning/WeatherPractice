package zerobase.weatherPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weatherPractice.domain.Diary;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> {


}
