package cn.lanqiao.pojo;

import cn.lanqiao.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;
public class Constitution implements Serializable {
    private Integer id;
    private String number;
    private String name;
    private String chooseone;
    private String choosetwo;
    private String choosethree;
    private String choosefour;
    private String choosefive;
    private String choosesix;
    private String chooseseven;
    private String chooseeight;
    private String time;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Constitution(Integer id, String number, String name, String chooseone, String choosetwo, String choosethree, String choosefour, String choosefive, String choosesix, String chooseseven, String chooseeight, String time) throws Exception {
        this.id = id;
        this.number = number;
        this.name = name;
        this.chooseone = chooseone;
        this.choosetwo = choosetwo;
        this.choosethree = choosethree;
        this.choosefour = choosefour;
        this.choosefive = choosefive;
        this.choosesix = choosesix;
        this.chooseseven = chooseseven;
        this.chooseeight = chooseeight;
        this.time = time;
        date=DateUtils.parseString2Date(time);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChooseone() {
        return chooseone;
    }

    public void setChooseone(String chooseone) {
        this.chooseone = chooseone;
    }

    public String getChoosetwo() {
        return choosetwo;
    }

    public void setChoosetwo(String choosetwo) {
        this.choosetwo = choosetwo;
    }

    public String getChoosethree() {
        return choosethree;
    }

    public void setChoosethree(String choosethree) {
        this.choosethree = choosethree;
    }

    public String getChoosefour() {
        return choosefour;
    }

    public void setChoosefour(String choosefour) {
        this.choosefour = choosefour;
    }

    public String getChoosefive() {
        return choosefive;
    }

    public void setChoosefive(String choosefive) {
        this.choosefive = choosefive;
    }

    public String getChoosesix() {
        return choosesix;
    }

    public void setChoosesix(String choosesix) {
        this.choosesix = choosesix;
    }

    public String getChooseseven() {
        return chooseseven;
    }

    public void setChooseseven(String chooseseven) {
        this.chooseseven = chooseseven;
    }

    public String getChooseeight() {
        return chooseeight;
    }

    public void setChooseeight(String chooseeight) {
        this.chooseeight = chooseeight;
    }

}
