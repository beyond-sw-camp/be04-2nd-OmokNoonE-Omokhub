package org.omoknoone.omokhub.user.query.entity;

public class PersonalLink {
    private int personalLinkId;
    private String url;
    private String memberId;

    public PersonalLink() {
    }

    public PersonalLink(int personalLinkId, String url, String memberId) {
        this.personalLinkId = personalLinkId;
        this.url = url;
        this.memberId = memberId;
    }

    public int getPersonalLinkId() {
        return personalLinkId;
    }

    public String getUrl() {
        return url;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "PersonalLink{" +
                "personalLinkId=" + personalLinkId +
                ", url='" + url + '\'' +
                ", memberId='" + memberId + '\'' +
                '}';
    }
}
