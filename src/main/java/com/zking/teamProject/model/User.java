package com.zking.teamProject.model;

<<<<<<< HEAD
import java.util.Date;

=======
import lombok.ToString;

import java.util.Date;

@ToString
>>>>>>> origin/master
public class User {
    private Integer uid;

    private String uname;

    private String utel;

    private String upwd;

    private String usalt;

    private Integer img;

    private String realName;

    private String realSex;

    private String realCard;

    private Date realDirthday;

    private String homeAdd;

    private Integer img1;

    private Integer img2;

    private Integer realHome;

    private Integer realChildren;

    private Integer realSalary;

    private Integer realEducation;

    private Integer realMarriage;

    private Date auditorTime;

    private Date applyTime;

    private Integer auditorId;

    private Integer ustate;

    private String uzfpwd;

    private String uzfsalt;

    public User(Integer uid, String uname, String utel, String upwd, String usalt, Integer img, String realName, String realSex, String realCard, Date realDirthday, String homeAdd, Integer img1, Integer img2, Integer realHome, Integer realChildren, Integer realSalary, Integer realEducation, Integer realMarriage, Date auditorTime, Date applyTime, Integer auditorId, Integer ustate, String uzfpwd, String uzfsalt) {
        this.uid = uid;
        this.uname = uname;
        this.utel = utel;
        this.upwd = upwd;
        this.usalt = usalt;
        this.img = img;
        this.realName = realName;
        this.realSex = realSex;
        this.realCard = realCard;
        this.realDirthday = realDirthday;
        this.homeAdd = homeAdd;
        this.img1 = img1;
        this.img2 = img2;
        this.realHome = realHome;
        this.realChildren = realChildren;
        this.realSalary = realSalary;
        this.realEducation = realEducation;
        this.realMarriage = realMarriage;
        this.auditorTime = auditorTime;
        this.applyTime = applyTime;
        this.auditorId = auditorId;
        this.ustate = ustate;
        this.uzfpwd = uzfpwd;
        this.uzfsalt = uzfsalt;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUsalt() {
        return usalt;
    }

    public void setUsalt(String usalt) {
        this.usalt = usalt;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealSex() {
        return realSex;
    }

    public void setRealSex(String realSex) {
        this.realSex = realSex;
    }

    public String getRealCard() {
        return realCard;
    }

    public void setRealCard(String realCard) {
        this.realCard = realCard;
    }

    public Date getRealDirthday() {
        return realDirthday;
    }

    public void setRealDirthday(Date realDirthday) {
        this.realDirthday = realDirthday;
    }

    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd;
    }

    public Integer getImg1() {
        return img1;
    }

    public void setImg1(Integer img1) {
        this.img1 = img1;
    }

    public Integer getImg2() {
        return img2;
    }

    public void setImg2(Integer img2) {
        this.img2 = img2;
    }

    public Integer getRealHome() {
        return realHome;
    }

    public void setRealHome(Integer realHome) {
        this.realHome = realHome;
    }

    public Integer getRealChildren() {
        return realChildren;
    }

    public void setRealChildren(Integer realChildren) {
        this.realChildren = realChildren;
    }

    public Integer getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(Integer realSalary) {
        this.realSalary = realSalary;
    }

    public Integer getRealEducation() {
        return realEducation;
    }

    public void setRealEducation(Integer realEducation) {
        this.realEducation = realEducation;
    }

    public Integer getRealMarriage() {
        return realMarriage;
    }

    public void setRealMarriage(Integer realMarriage) {
        this.realMarriage = realMarriage;
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    public String getUzfpwd() {
        return uzfpwd;
    }

    public void setUzfpwd(String uzfpwd) {
        this.uzfpwd = uzfpwd;
    }

    public String getUzfsalt() {
        return uzfsalt;
    }

    public void setUzfsalt(String uzfsalt) {
        this.uzfsalt = uzfsalt;
    }
}