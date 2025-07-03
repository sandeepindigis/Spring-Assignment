package org.example.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean, DisposableBean {

    public Motor() {
        System.out.println("Motor constructor");
    }
//   This method is used when handle life cycle via bean classes
//    public void start(){
//        System.out.println("Motor staring ...");
//    }

    public void doWork(){
        System.out.println("Motor pulling the water");
    }

//    This method is used when handle life cycle via bean classes
//    public void stop(){
//        System.out.println("Motor stoping ...");
//    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Motor stoping ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Motor staring ...");
    }
}
