package com.gsunis.pattern.factory.abstractfactory;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : MysqlFactory
 * @Creation Date : 2019/3/12 10:05 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class MysqlFactory implements DbFactory {
    public IQuery createQuery() {
        return new MysqlQuery();
    }

    public IUpdate createUpdate() {
        return new MysqlUpdate();
    }
}
