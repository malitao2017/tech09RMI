package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImpl extends UnicastRemoteObject implements IService {

	private static final long serialVersionUID = 1L;

	protected ServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String queryName(String no) throws RemoteException {
		//方法的具体实现
		System.out.println("原生java rmi测试："+no);
		return String.valueOf("传入为："+no + " 当前时间 ："+System.currentTimeMillis());
	}
	
}
