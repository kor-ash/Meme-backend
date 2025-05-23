package backend.exception;

public class EmailAlreadyExistsException extends IllegalArgumentException {
    public EmailAlreadyExistsException(String email) {
        super("이미 존재하는 이메일입니다: " + email);
    }
}