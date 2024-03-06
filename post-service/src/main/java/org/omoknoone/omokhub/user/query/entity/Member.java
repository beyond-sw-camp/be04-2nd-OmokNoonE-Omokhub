package org.omoknoone.omokhub.user.query.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Member {
    private String memberId;
    private String name;
    private String nickname;
    private String password;
    private String email;
    private String phoneNum;
    private String address;
    private LocalDate birthday;
    private LocalTime signUpDate;
    private boolean isWithdraw;

    public Member() {
    }

    public Member(String memberId, String name, String nickname, String password, String email, String phoneNum, String address, LocalDate birthday, LocalTime signUpDate, boolean isWithdraw) {
        this.memberId = memberId;
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

    public String getMemberId() {
        return memberId;
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
        return "Member{" +
                "memberId='" + memberId + '\'' +
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
