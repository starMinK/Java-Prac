package chapter2.ch07;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userInfoLee = new UserInfo();
        userInfoLee.userId = "a1234";
        userInfoLee.userPassword = "asdad2";
        userInfoLee.userName = "Lee";
        userInfoLee.userAddress = "Soul";

        System.out.println(userInfoLee.showUserInfo());

        UserInfo userInfoKim = new UserInfo("123", "123", "123");
        System.out.println(userInfoKim.showUserInfo());


    }
}
