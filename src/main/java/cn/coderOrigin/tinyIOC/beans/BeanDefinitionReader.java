package cn.coderOrigin.tinyIOC.beans;

/**
 * @author Gao Yuan
 * @date 2020-03-03 - 21:50
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;

}
