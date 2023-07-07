package lecture0601;

class MinusException extends Exception {
    public MinusException() {
        super();
    }

    public MinusException(String messege) {
        super(messege);
    }
}

class OverException extends Exception {
    public OverException() {
        super();
    }

    public OverException(String message) {
        super(message);
    }
}

class UserExceptionExampleA {
    void checkScore(int score) throws MinusException, OverException {
        if (score < 0) {
            throw new MinusException("음수값을 입력하셨습니다.");
        } else if (score > 100) {
            throw new OverException("100점을 초과한 값을 입력하셨습니다.");
        } else {
            System.out.println("정상적인 값입니다.");
        }
    }
}
public class UserExceptionExample {
    public static void main(String[] args) {
        UserExceptionExampleA a = new UserExceptionExampleA();
        try {
            a.checkScore(85);
            a.checkScore(120);
        } catch (MinusException | OverException e) {
            System.out.println(e.getMessage());

        }
    }
}