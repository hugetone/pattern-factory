package com.gsunis.pattern.factory;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : OracleDataBase
 * @Creation Date : 2019/3/9 10:55 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class OracleDataBase implements IDataBase {
    public void getConnection() {
        System.out.println("获取Oracle连接");
    }
}
