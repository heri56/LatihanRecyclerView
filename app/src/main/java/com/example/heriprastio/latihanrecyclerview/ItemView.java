package com.example.heriprastio.latihanrecyclerview;

public class ItemView {
    public String text;
    public int imgid;

    public ItemView(String text, int imgid) {
        this.text = text;
        this.imgid = imgid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
