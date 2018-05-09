package TestTimeServer;

/**
* TestTimeServer/ObjTimeServerHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从TestTimeServer.idl
* 2018年5月10日星期四 中国标准时间 上午12:39:49
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
