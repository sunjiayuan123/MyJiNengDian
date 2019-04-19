package com.example.myjinengdian;

/**
 * Created by SunJiaYuan  Date: 2019/4/18
 */
public class MyBean {
    //孙家圆
    private String title;
    private String img;
    private int color;

    public MyBean() {
    }

    public MyBean(String title, String img, int color) {
        this.title = title;
        this.img = img;
        this.color = color;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", color=" + color +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public int getColor() {
        return color;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
