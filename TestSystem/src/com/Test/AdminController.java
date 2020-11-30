package com.Test;

import com.Test.Staff;

import java.sql.Connection;

/**
 * @ClassName addStaff
 * @Version 1.0
 * @Author 何政梁
 * @Date 2020/11/17 1:34
 * @Description TODO
 * Modification User:
 * Modification Date:
 */
public class AdminController {

    Connection connection;
    public void getConnection(){
        connection = DBUtil.getConnection();
    }

    public int addStaff(Staff staff){
        return 1;
    }

    public int formNotice(String content, String time){
        return 1;
    }

    public int approvalApply(int id){
        return 1;
    }
}
