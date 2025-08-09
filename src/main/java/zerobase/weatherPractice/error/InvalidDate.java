package zerobase.weatherPractice.error;

public class InvalidDate extends RuntimeException {
    private static final String MESSAGE = "너무 과거 혹은 미래입니다.";

    public InvalidDate() {
        super(MESSAGE);
    }
}
