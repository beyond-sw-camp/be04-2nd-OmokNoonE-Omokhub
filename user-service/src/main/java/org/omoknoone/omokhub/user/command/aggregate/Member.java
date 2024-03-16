package org.omoknoone.omokhub.user.command.aggregate;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
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
    @Column
    private String roleName;
    public Member() {
    }

    public Member(String memberId, String name, String nickname, String password, String email, String phoneNum, String address, String birthday, String signUpDate, boolean isWithdraw, String roleName) {
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
        this.roleName = roleName;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

    public boolean getIsWithdraw() {
        return isWithdraw;
    }

    public void setIsWithdraw(boolean withdraw) {
        isWithdraw = withdraw;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
                ", birthday='" + birthday + '\'' +
                ", signUpDate='" + signUpDate + '\'' +
                ", isWithdraw=" + isWithdraw +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    @PrePersist
    public void prePersist() {
        if(this.roleName == null || this.roleName.isEmpty()) setRoleName("ROLE_ADMIN");
    }
}
