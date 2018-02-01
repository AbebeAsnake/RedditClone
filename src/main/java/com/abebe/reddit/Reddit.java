package com.abebe.reddit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
@Entity
public class Reddit {
    @Id
    @GeneratedValue
    private long id;
    private String title;

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    private String dateCreated;
    private String link;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDateCreated() {

        Date date = new Date();

        String strDateFormat = "hh:mm:ss a";

        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);

        dateCreated= dateFormat.format(date);
        return dateCreated;
    }

    public String getLink() {
        return link;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setLink(String link) {
        this.link = link;
    }






}
