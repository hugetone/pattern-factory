package com.gsunis.pattern.factory.simplefactory;

import com.gsunis.pattern.factory.IDataBase;
import com.gsunis.pattern.factory.MysqlDataBase;
import com.gsunis.pattern.factory.OracleDataBase;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : SimpleFactoryTest
 * @Creation Date : 2019/3/9 10:37 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {

//        IDataBase dataBase = new MysqlDataBase();
//        dataBase.getConnection();

//        DbFactory dbFactory = new DbFactory();
//        IDataBase mysql = dbFactory.create("oracle");
//        mysql.getConnection();

//        DbFactory dbFactory  = new DbFactory();
//        IDataBase dataBase = dbFactory.create("com.gsunis.pattern.factory.MysqlDataBase");
//        dataBase.getConnection();

        DbFactory dbFactory  = new DbFactory();
        IDataBase dataBase = dbFactory.create(OracleDataBase.class);
        dataBase.getConnection();
    }
}
