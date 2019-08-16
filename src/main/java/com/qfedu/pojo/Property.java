package com.qfedu.pojo;


import java.util.Date;

/**
 * Property 用户房产信息的实体类对象
 *
 * @author  王振东
 * @date 2019/08/02
 * @version v1.0
 */
public class Property {
    private Integer id;
    private String projectName;
    private Integer userId;
    private String housingType;
    private Integer usableArea;
    private Date constructionTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHousingType() {
        return housingType;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }

    public Integer getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Integer usableArea) {
        this.usableArea = usableArea;
    }

    public Date getConstructionTime() {
        return constructionTime;
    }

    public void setConstructionTime(Date constructionTime) {
        this.constructionTime = constructionTime;
    }
}
