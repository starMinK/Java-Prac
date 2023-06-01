package lecture0601;

import java.util.*;

/*
* 문제
* 로또 복권을 추첨합니다.
* 복권이 중복되지 않도록 출력하세요.
*
* 조건
* 1. Random 클래스 적용
* 2. 예외처리를 적용
* 3. 중복되지 않아야 합니다.
* 4. 범위 1~45*/
public class ExceptionQuestion2 {
    private static final int LOTTO_SIZE = 6;
    private static final int LOTTO_RANGE = 45;
    public static void main(String[] args) {
        List<Integer> lotto = generateLottoNumbers();
        System.out.println(lotto);
    }
    private static List<Integer> generateLottoNumbers() {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random r = new Random();

        while (uniqueNumbers.size() < LOTTO_SIZE) {
            int num = r.nextInt(LOTTO_RANGE) + 1;
            uniqueNumbers.add(num);
        }

        return new ArrayList<>(uniqueNumbers);
    }
    /*public static List<Integer> generateLottoNumbers() {
        ArrayList<Integer> lotto = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = (r.nextInt(45));
            if (lotto.contains(num)) {
                i--;
                continue;
            }
            lotto.add(num);
        }
        return new ArrayList<>(lotto);
    }*/
}
