package com.moodincode.action;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


/**
 * createBy: moodincode
 * createDate: 2018/7/23 9:58
 * lastModifyDate: 2018/7/23 9:58
 * description:
 */
/*@Controller(value = "userLogin")*/
@Controller
@Scope("prototype")

public class LoginAction extends DefaultActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("hello  i am ressd");
        return "success";
    }
    public String  login() {
        System.out.println("hello  i am limanman");
        return "login";

    }
}
