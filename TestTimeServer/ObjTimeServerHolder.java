package TestTimeServer;

/**
* TestTimeServer/ObjTimeServerHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��TestTimeServer.idl
* 2018��5��10�������� �й���׼ʱ�� ����12:39:49
*/

public final class ObjTimeServerHolder implements org.omg.CORBA.portable.Streamable
{
  public TestTimeServer.ObjTimeServer value = null;

  public ObjTimeServerHolder ()
  {
  }

  public ObjTimeServerHolder (TestTimeServer.ObjTimeServer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TestTimeServer.ObjTimeServerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TestTimeServer.ObjTimeServerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TestTimeServer.ObjTimeServerHelper.type ();
  }

}
