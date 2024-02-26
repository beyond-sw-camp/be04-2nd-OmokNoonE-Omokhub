package org.omoknoone.omokhub.user.query;

public class PersonalLink {
    private int personal_link_id;
    private String url;
    private String user_id;

    public PersonalLink() {
    }

    public PersonalLink(int personal_link_id, String url, String user_id) {
        this.personal_link_id = personal_link_id;
        this.url = url;
        this.user_id = user_id;
    }

    public int getPersonal_link_id() {
        return personal_link_id;
    }

    public String getUrl() {
        return url;
    }

    public String getUser_id() {
        return user_id;
    }

    @Override
    public String toString() {
        return "PersonalLink{" +
                "personal_link_id=" + personal_link_id +
                ", url='" + url + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
