package chapter2.ch07;

public class UserInfo {

    public String userId;
    public String userPassword;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo(){}

    public UserInfo(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "your id is" + userId + "and, ur name is" + userName;
    }
}
