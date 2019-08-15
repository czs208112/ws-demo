package fun.chickcc.wsserver.config;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "DemoService", // 暴露服务名称
        targetNamespace = "http://config.wsserver.chickcc.fun"// 命名空间,一般是接口的包名倒序
)
public interface DataService {
    @WebMethod
    String sayHello(@WebParam(name = "user") String user);
}