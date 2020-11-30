package com.Test;

import java.sql.Connection;

/**
 * @ClassName Apply
 * @Version 1.0
 * @Author 何政梁
 * @Date 2020/11/17 1:56
 * @Description TODO
 * Modification User:
 * Modification Date:
 */
public class StaffController {
    Connection connection;
    public void getConnection(){
         connection = DBUtil.getConnection();
    }
    public int postApply(int type,String reason,int staffId){
        return 1;
    }

    public Goods query(String goodsName){
        Goods goods = new Goods();
        return goods;
    }

    public int inGoods(String goodsName,String inTime){
        return 1;
    }

    public int outGoods(String goodsName,String outTime){
        return 1;
    }

    public int inPerson(String personName,String sex,String identify,String reason,String inTime){
        return 1;
    }

    public int outPerson(String personName,String sex,String identify,String reason,String outTime){
        return 1;
    }
    public int AddStudent(Student student){
        return 1;
    }
}
