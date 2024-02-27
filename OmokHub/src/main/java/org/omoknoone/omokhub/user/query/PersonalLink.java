package org.omoknoone.omokhub.user.query;

public class PersonalLink {
    private int personalLinkId;
    private String url;
    private String userId;

    public PersonalLink() {
    }

    public PersonalLink(int personalLinkId, String url, String userId) {
        this.personalLinkId = personalLinkId;
        this.url = url;
        this.userId = userId;
    }

    public int getPersonalLinkId() {
        return personalLinkId;
    }

    public String getUrl() {
        return url;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "PersonalLink{" +
                "personalLinkId=" + personalLinkId +
                ", url='" + url + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
