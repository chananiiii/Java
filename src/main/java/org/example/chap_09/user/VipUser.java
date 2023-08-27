package org.example.chap_09.user;

// 부모에 생성자가 있으면, 호출해주어야함
public class VipUser extends User{
    public VipUser(String name) {
        super("특별한 " + name);
    }
}
