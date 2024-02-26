package org.omoknoone.omokhub.user.query;

import java.time.LocalDate;
import java.time.LocalTime;

public class User {
    private String userId;
    private String name;
    private String nickname;
    private String password;
    private String email;
    private String phoneNum;
    private String address;
    private LocalDate birthday;
    private LocalTime signUpDate;
    private boolean isWithdraw;

    public User() {
    }

    public User(String userId, String name, String nickname, String password, String email, String phoneNum, String address, LocalDate birthday, LocalTime signUpDate, boolean isWithdraw) {
        this.userId = userId;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.birthday = birthday;
        this.signUpDate = signUpDate;
        this.isWithdraw = isWithdraw;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalTime getSignUpDate() {
        return signUpDate;
    }

    public boolean isWithdraw() {
        return isWithdraw;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", signUpDate=" + signUpDate +
                ", isWithdraw=" + isWithdraw +
                '}';
    }
}
