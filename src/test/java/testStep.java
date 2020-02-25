import cn.coderOrigin.tinyIOC.BeanDefinition;
import cn.coderOrigin.tinyIOC.HelloWorldService;
import cn.coderOrigin.tinyIOC.factory.AutowireCapableBeanFactory;
import cn.coderOrigin.tinyIOC.factory.BeanFactory;

/**
 * @author Gao Yuan
 * @date 2020-02-25 - 14:43
 */

public class testStep {
    // step1
//    public static void main(String[] args) {
//        // 1.初始化beanFactory
//        BeanFactory factory = new BeanFactory();
//
//        // 2.注册Bean对象
//        BeanDefinition beanDefinition = new BeanDefinition(new cn.coderOrigin.tinyIOC.HelloWorldService());
//        factory.registerBeanDefinition("helloWorldService", beanDefinition);
//
//        // 3.直接调用bean对象
//        cn.coderOrigin.tinyIOC.HelloWorldService helloWorldService = (cn.coderOrigin.tinyIOC.HelloWorldService) factory.getBean("helloWorldService");
//        helloWorldService.helloWorld();
//    }

    public static void main(String[] args) {
        // 1.初始化beanFactory
        BeanFactory factory = new AutowireCapableBeanFactory();

        // 2.注入Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("cn.coderOrigin.tinyIOC.HelloWorldService");
        factory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) factory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}