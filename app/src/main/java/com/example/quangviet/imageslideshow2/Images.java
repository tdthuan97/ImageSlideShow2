package com.example.quangviet.imageslideshow2;

/**
 * Created by HV on 2/2/2018.
 */

public class Images {
    int id;
    String desc;

    public Images(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
