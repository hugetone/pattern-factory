package com.gsunis.pattern.factory.simplefactory;

import com.gsunis.pattern.factory.IDataBase;
import com.gsunis.pattern.factory.MysqlDataBase;
import com.gsunis.pattern.factory.OracleDataBase;
import com.sun.tools.classfile.Code_attribute;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : DbFactory
 * @Creation Date : 2019/3/9 10:36 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class DbFactory extends SimpleFactoryTest {

//    public IDataBase create(String name) {
//        if ("mysql".equals(name)) {
//            return new MysqlDataBase();
//        } else if ("oracle".equals(name)) {
//            return new OracleDataBase();
//        } else {
//            return null;
//        }
//    }

//    public IDataBase create(String className) {
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (IDataBase) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public IDataBase create(Class<? extends IDataBase> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
