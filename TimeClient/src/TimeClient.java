//TimeClient.java 

import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import TestTimeServer.*;

public class TimeClient{
	public static void main(String[] argv) {
 		try{
 			// 创建一个 ORB
   			ORB orb = ORB.init(argv,null);
   			System.out.println("ORB initial...");
   			// 获取一个命名上下文
    		org.omg.CORBA.Object obRef = orb.resolve_initial_references("NameService");
    		NamingContext ncRef = NamingContextHelper.narrow(obRef);
   			// 在命名上下文中查找 "TimeServer" 并获得指向该 CORBA 对象的引用
      		NameComponent nc = new NameComponent("TimeServer", "");
      		NameComponent path[] = { nc };
      		ObjTimeServer server = ObjTimeServerHelper.narrow(ncRef.resolve(path));
      		System.out.println("我在客户端，开始调用CORBA服务器端的'getTime'方法...");
      		// 调用对象的 getTime() 操作并打印结果
            System.out.println("欢迎, " + server.getTime());
    	}catch (Exception e) {
            System.out.println("错误 : " + e);
            e.printStackTrace(System.out);
        }
	}
};

