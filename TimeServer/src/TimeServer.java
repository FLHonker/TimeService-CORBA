// TimeServer.java 
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import TestTimeServer.*;

public class TimeServer	{
	public static void main(String[] argv) { 
		try{
    		//初始化ORB
    		ORB orb=ORB.init(argv,null);
   			System.out.println("ORB initial...");
    		//创建一个实例,并向ORB注册
    		TimeServerImpl serverImpl = new TimeServerImpl();
    		orb.connect(serverImpl);
    		System.out.println("将实例注册到ORB");
			//System.out.println("等待CORBA客户端调用...");
    		//获取一个命名上下文
    		org.omg.CORBA.Object obRef = orb.resolve_initial_references("NameService");
    		NamingContext ncRef = NamingContextHelper.narrow(obRef);
    		//绑定命名中的对象引用
    		NameComponent nc = new NameComponent("TimeServer","");
    		NameComponent path[] = { nc };
    		ncRef.rebind(path, serverImpl);
    		//等待客户机的调用
    		java.lang.Object sync = new java.lang.Object();
            synchronized (sync) {
            	sync.wait();
            }
            System.out.println("等待CORBA客户端调用...");
		} catch (Exception e) {
            System.err.println("错误: " + e);
            e.printStackTrace(System.out);
        }
   }
};
