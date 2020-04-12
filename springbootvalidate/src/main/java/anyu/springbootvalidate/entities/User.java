package anyu.springbootvalidate.entities;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.ImportResource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @NotNull:对基本数据的对象类型进行非空校验
 * @NotBlank:对字符串类型进行非空校验
 * @NotEmpty:对集合类型进行非空校验
 */

public class User {
    @NotNull(message = "{userid.notnull}")
    private Integer id;
    @NotBlank(message = "{username.notnull}")
    @Length(min =3 ,max = 8 ,message = "最小3最大8")
    private String username;
    @NotBlank(message = "{usersex.notnull}")
    private String sex;
    private Date birthday;
    @NotBlank(message = "address不能为空")
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
