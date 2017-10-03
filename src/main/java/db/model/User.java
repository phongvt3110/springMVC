package db.model;

import java.util.Date;

public class User {
    private int userId;
    private String username;
    private String createdBy;
    private Date createdDate;

    public User(){}

    public User(User usr) {
        this.userId = usr.getUserId();
        this.username = usr.getUsername();
        this.createdBy = usr.getCreatedBy();
        this.createdDate = usr.getCreatedDate();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
