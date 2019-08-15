package fun.chickcc.wsclient;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsClientApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(WsClientApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/demo/api?wsdl");
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            Object[] objects = client.invoke("sayHello", "zhangs");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
