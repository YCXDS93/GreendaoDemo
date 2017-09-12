package hc.com.greendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by YU on 2017/9/12.
 */
@Entity
public class User {
    @Id
    private  long id;
    private String name;
    @Generated(hash = 586692638)
    public User() {
    }
    @Generated(hash = 1144922831)
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}
