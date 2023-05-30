package lecture0530;    //<- 패키지

class A {   //default 제어자: 같은 패키지 내부에서 접근 가능
    int m = 3, n = 4;
    int k;
    void work1() {
        int k = 5;
        System.out.println(k);
        work2(3);
    }

    void work2(int i) {
        int j = 4;
        System.out.println(i + j);
    }
}