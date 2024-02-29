package org.omoknoone.omokhub.user.query;

import java.time.LocalDate;

public class MemberDTO {
    private String memberId;
    private String name;
    private String nickname;
    private String email;
    private String phoneNum;
    private String address;
    private LocalDate birthday;
    private Integer profileCount;

    public MemberDTO() {
    }

    public MemberDTO(String memberId, String name, String nickname, String email, String phoneNum, String address, LocalDate birthday, int profileCount) {
        this.memberId = memberId;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.birthday = birthday;
        this.profileCount = profileCount;
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

    public int getProfileCount() {
        return profileCount;
    }

    public void setProfileCount(int profileCount) {
        this.profileCount = profileCount;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", profileCount=" + profileCount +
                '}';
    }
}
