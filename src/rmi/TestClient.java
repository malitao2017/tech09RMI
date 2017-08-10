package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//RMI客户端  
public class TestClient {
	public static void main(String[] args) throws Exception{
		// 注册管理器  
		Registry registry = null;
		// 获取服务注册管理器  
		registry = LocateRegistry.getRegistry("127.0.0.1",8088);
		// 列出所有注册的服务  
		String[] list = registry.list();
		for(int i=0;i<list.length;i++){
			System.out.println("客户端有的实例"+i+":"+list[i]);
		}
		
		// 根据命名获取服务  
		// 调用远程方法  
		IService service = (IService) registry.lookup("vince");
		String result = service.queryName("ha ha ha ha");
		// 输出调用结果  
		System.out.println("客户端测试：result from remote :" + result);
	}
}
