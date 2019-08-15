package fun.chickcc.wsserver.config.impl;

import fun.chickcc.wsserver.config.DataService;

import javax.jws.WebService;
import java.util.Date;

@WebService(serviceName = "DemoService", // 与接口中指定的name一致
        targetNamespace = "http://config.wsserver.chickcc.fun", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "fun.chickcc.wsserver.config.DataService") // 接口地址
public class DemoServiceImpl implements DataService {
    @Override
    public String sayHello(String user) {
        return user + "，现在时间：" + "(" + new Date() + ")";
    }
}