package com.gsunis.pattern.factory.factorymethod;

import com.gsunis.pattern.factory.IDataBase;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : FactoryMethodTest
 * @Creation Date : 2019/3/12 9:35 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IDataBaseFactory factroy = new MysqlDataBaseFactory();
        IDataBase db = factroy.create();
        db.getConnection();

        factroy = new OracleDataBaseFactory();
        db = factroy.create();
        db.getConnection();

    }
}
