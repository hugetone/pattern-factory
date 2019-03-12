package com.gsunis.pattern.factory.abstractfactory;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : AbstractFactoryTest
 * @Creation Date : 2019/3/12 10:07 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        DbFactory factory = new OracleFactroy();
        factory.createQuery().query();
        factory.createUpdate().update();
    }
}
