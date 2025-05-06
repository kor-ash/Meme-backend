package backend.exception;

public class InvalidCredentialsException extends IllegalArgumentException {
    public InvalidCredentialsException() {
        super("이메일 또는 비밀번호가 일치하지 않습니다.");
    }
}