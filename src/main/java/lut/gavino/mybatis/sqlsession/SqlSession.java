package lut.gavino.mybatis.sqlsession;

/**
 * @Author: Yan Weigang
 * @Date: 2019/5/17 15:58
 * @Version 1.0
 */
/**
 * 自定义Mybatis中和数据库交互的核心类
 *  它里面可以创建dao接口的代理对象
 */
public interface SqlSession {

    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
