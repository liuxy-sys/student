package pers.huangyuhui.sms.bean;

/**
 * @ClassName LoginForm
 * @Description TODO
 * @Author lxy
 * @Date 2020/7/9
 * @Since 1.8
 * @Version 1.0
 */
public class LoginForm {

    private String username;
    private String password;
    private Integer userType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}
