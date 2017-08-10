package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
//RMI服务端  
public class TestServer {
	public static void main(String[] args) throws RemoteException {
		// 注册管理器  
		Registry registry = null;
		// 创建一个服务注册管理器  
		registry = LocateRegistry.createRegistry(8088);
		
		// 创建一个服务  
		ServiceImpl serviceImpl = new ServiceImpl();
		// 将服务绑定命名  
		registry.rebind("vince", serviceImpl);
		System.out.println("rmi服务端测试：bind server");
		
	}
}
