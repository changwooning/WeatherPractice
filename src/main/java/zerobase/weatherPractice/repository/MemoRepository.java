package zerobase.weatherPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.weatherPractice.domain.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
