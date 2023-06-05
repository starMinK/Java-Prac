package lecture0605;

import java.util.*;

public class ListQuestion {
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;
    private static final int LOTTO_NUMBER_COUNT = 6;

    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();

    private static List<Integer> myLotto = new ArrayList<>();
    private static Set<Integer> lottoNumber = new HashSet<>();
    public static void main(String[] args) {
        inputMyLottoNumbers();
        generateLottoNumbers();
        price();
    }

    private static void inputMyLottoNumbers() {
        while (myLotto.size() < LOTTO_NUMBER_COUNT) {
            System.out.println("구매하실 로또 번호를 입력해 주세요.");
            try {
                int myLottoNumber = sc.nextInt();
                if (myLottoNumber >= MIN_LOTTO_NUMBER && myLottoNumber <= MAX_LOTTO_NUMBER) {
                    myLotto.add(myLottoNumber);
                } else {
                    System.out.println("1~45 사이의 숫자만 입력 가능합니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("1~45 사이의 숫자만 입력 가능합니다.");
                sc.next(); // 잘못된 입력을 버림
            }
        }
        System.out.println("선택하신 번호: " + myLotto);
    }

    private static void generateLottoNumbers() {
        while (lottoNumber.size() < LOTTO_NUMBER_COUNT) {
            int number = random.nextInt(MAX_LOTTO_NUMBER) + MIN_LOTTO_NUMBER;
            lottoNumber.add(number);
        }
        System.out.println("이번 로또 당첨 번호: " + lottoNumber);
    }

    private static void price() {
        int count = 0;
        for (int number : myLotto) {
            if (lottoNumber.contains(number)) {
                count++;
            }
        }

        String rang = "";
        switch (count) {
            case 6:
                rang = "1등입니다!";
                break;
            case 5:
                rang = "2등입니다!";
                break;
            case 4:
                rang = "3등입니다!";
                break;
            case 3:
                rang = "4등입니다!";
                break;
            case 2:
                rang = "5등입니다!";
                break;
            default:
                rang = "탈락 ㅜㅜ";
        }
        System.out.println("일치하는 수의 개수: " + count);
        System.out.println(rang);
    }
}
