package org.omoknoone.omokhub.user.command.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @Column
    private String memberId;
    @Column
    private String name;
    @Column
    private String nickname;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String phoneNum;
    @Column
    private String address;
    @Column
    private String birthday;
    @Column
    @CreationTimestamp
    private String signUpDate;
    @Column(name = "IS_WITHDRAW")
    private boolean isWithdraw;

    public Member() {
    }

    public Member(String memberId, String name, String nickname, String password, String email, String phoneNum, String address, String birthday, String singUpDate, boolean isWithdraw) {
        this.memberId = memberId;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.birthday = birthday;
        this.signUpDate = singUpDate;
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

    public String getBirthday() {
        return birthday;
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public boolean getIsWithdraw() {
        return isWithdraw;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

    public void setIsWithdraw(boolean withdraw) {
        isWithdraw = withdraw;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", singUpDate='" + signUpDate + '\'' +
                ", isWithdraw=" + isWithdraw +
                '}';
    }
}
