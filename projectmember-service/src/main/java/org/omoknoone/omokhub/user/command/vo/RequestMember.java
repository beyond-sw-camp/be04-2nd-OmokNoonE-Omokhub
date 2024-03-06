package org.omoknoone.omokhub.user.command.vo;

import java.time.LocalDate;

public class RequestMember {
    private String memberId;
    private String name;
    private String nickname;
    private String password;
    private String email;
    private String phoneNum;
    private String address;
    private LocalDate birthday;

    public RequestMember() {
    }

    public RequestMember(String memberId, String name, String nickname, String password, String email, String phoneNum, String address, LocalDate birthday) {
        this.memberId = memberId;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.birthday = birthday;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "RequestMember{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
