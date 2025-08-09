package zerobase.weatherPractice.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String handleAllException(Exception e) {
        // 1. 예외 내용 로그 찍기
        e.printStackTrace();
        System.out.println("error from GlobalExceptionHandler : " + e.getMessage());
        // 2. 클라이언트에게 메시지 전달
        return e.getMessage() != null ? e.getMessage() : "Internal server error";
    }

}
