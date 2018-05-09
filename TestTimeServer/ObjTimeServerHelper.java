package TestTimeServer;


/**
* TestTimeServer/ObjTimeServerHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从TestTimeServer.idl
* 2018年5月10日星期四 中国标准时间 上午12:39:49
*/

abstract public class ObjTimeServerHelper
{
  private static String  _id = "IDL:TestTimeServer/ObjTimeServer:1.0";

  public static void insert (org.omg.CORBA.Any a, TestTimeServer.ObjTimeServer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static TestTimeServer.ObjTimeServer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (TestTimeServer.ObjTimeServerHelper.id (), "ObjTimeServer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static TestTimeServer.ObjTimeServer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ObjTimeServerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, TestTimeServer.ObjTimeServer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static TestTimeServer.ObjTimeServer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof TestTimeServer.ObjTimeServer)
      return (TestTimeServer.ObjTimeServer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      TestTimeServer._ObjTimeServerStub stub = new TestTimeServer._ObjTimeServerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static TestTimeServer.ObjTimeServer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof TestTimeServer.ObjTimeServer)
      return (TestTimeServer.ObjTimeServer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      TestTimeServer._ObjTimeServerStub stub = new TestTimeServer._ObjTimeServerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
