package com.moodincode.action;

import com.moodincode.entity.User;
import com.moodincode.service.UserService;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;


/**
 * createBy: moodincode
 * createDate: 2018/7/23 9:58
 * lastModifyDate: 2018/7/23 9:58
 * description:
 */
/*@Controller(value = "userLogin")*/
@Controller("myIndex")
@Scope("prototype")

public class IndexAction extends DefaultActionSupport {
    @Autowired
    private UserService userService;
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    private int id;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("hello  , i am a execute method in IndexAction");
        return "index2";
    }
    public String  save() {
        User user=new User();
        user.setAge(18);
        user.setName("小姑凉");
        user.setBirthday(new Date());
        user.setPassword("123456");
        user.setSex("female");
        user.setUserName("littleGirl");
        userService.save(user);
        System.out.println("success to save :"+user.getId());
        return "index";

    }
    public String  index() {
        System.out.println("hello!, i am a index method in IndexAction");
        return "index";

    }
    public String list(){
        userList=userService.findAll();
        return "list";
    }
    public String get(){
        user=userService.getById(id);
        return "user";
    }
}
