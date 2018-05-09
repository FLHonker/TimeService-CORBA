//TimeClient.java 

import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import TestTimeServer.*;

public class TimeClient{
	public static void main(String[] argv) {
 		try{
 			// ����һ�� ORB
   			ORB orb = ORB.init(argv,null);
   			System.out.println("ORB initial...");
   			// ��ȡһ������������
    		org.omg.CORBA.Object obRef = orb.resolve_initial_references("NameService");
    		NamingContext ncRef = NamingContextHelper.narrow(obRef);
   			// �������������в��� "TimeServer" �����ָ��� CORBA ���������
      		NameComponent nc = new NameComponent("TimeServer", "");
      		NameComponent path[] = { nc };
      		ObjTimeServer server = ObjTimeServerHelper.narrow(ncRef.resolve(path));
      		System.out.println("���ڿͻ��ˣ���ʼ����CORBA�������˵�'getTime'����...");
      		// ���ö���� getTime() ��������ӡ���
            System.out.println("��ӭ, " + server.getTime());
    	}catch (Exception e) {
            System.out.println("���� : " + e);
            e.printStackTrace(System.out);
        }
	}
};

