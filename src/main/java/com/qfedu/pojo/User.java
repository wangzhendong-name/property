package com.qfedu.pojo;

/**
 * User 用户登录信息的实体类对象
 *
 * @author  王振东
 * @date 2019/08/02
 * @version v1.0
 */
public class User {
    private Integer uid;
    private String idNumber;
    private String userName;
    private String password;
    private Integer abnormalAccount;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAbnormalAccount() {
        return abnormalAccount;
    }

    public void setAbnormalAccount(Integer abnormalAccount) {
        this.abnormalAccount = abnormalAccount;
    }
}
