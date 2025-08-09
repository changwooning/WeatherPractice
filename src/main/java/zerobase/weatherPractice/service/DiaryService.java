package zerobase.weatherPractice.service;

import org.springframework.stereotype.Service;
import zerobase.weatherPractice.domain.Diary;
import zerobase.weatherPractice.repository.DiaryRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class DiaryService {

    private DiaryRepository diaryRepository;

    public DiaryService(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }


    public void createDiary(LocalDate date, String context) {
        
    }

    public List<Diary> readDiary(LocalDate date) {
    }

    public List<Diary> readDiaries(LocalDate startDate, LocalDate endDate) {
    }

    public void updateDiary(LocalDate date, String context) {
    }

    public void deleteDiary(LocalDate date) {
    }
}
