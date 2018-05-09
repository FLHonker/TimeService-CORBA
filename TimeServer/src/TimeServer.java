// TimeServer.java 
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import TestTimeServer.*;

public class TimeServer	{
	public static void main(String[] argv) { 
		try{
    		//��ʼ��ORB
    		ORB orb=ORB.init(argv,null);
   			System.out.println("ORB initial...");
    		//����һ��ʵ��,����ORBע��
    		TimeServerImpl serverImpl = new TimeServerImpl();
    		orb.connect(serverImpl);
    		System.out.println("��ʵ��ע�ᵽORB");
			//System.out.println("�ȴ�CORBA�ͻ��˵���...");
    		//��ȡһ������������
    		org.omg.CORBA.Object obRef = orb.resolve_initial_references("NameService");
    		NamingContext ncRef = NamingContextHelper.narrow(obRef);
    		//�������еĶ�������
    		NameComponent nc = new NameComponent("TimeServer","");
    		NameComponent path[] = { nc };
    		ncRef.rebind(path, serverImpl);
    		//�ȴ��ͻ����ĵ���
    		java.lang.Object sync = new java.lang.Object();
            synchronized (sync) {
            	sync.wait();
            }
            System.out.println("�ȴ�CORBA�ͻ��˵���...");
		} catch (Exception e) {
            System.err.println("����: " + e);
            e.printStackTrace(System.out);
        }
   }
};
