package com.allen.followsuit.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goodsid;
    private String name;
    private BigDecimal price;
    private String mainpicture;
    private String detailedpicture;
    private String date;
    private Integer inventory;
    private String introduction;
    private String type;
    private String clotheskind;

    public Long getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Long goodsid) {
        this.goodsid = goodsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMainpicture() {
        return mainpicture;
    }

    public void setMainpicture(String mainpicture) {
        this.mainpicture = mainpicture;
    }

    public String getDetailedpicture() {
        return detailedpicture;
    }

    public void setDetailedpicture(String detailedpicture) {
        this.detailedpicture = detailedpicture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClotheskind() {
        return clotheskind;
    }

    public void setClotheskind(String clotheskind) {
        this.clotheskind = clotheskind;
    }
}
