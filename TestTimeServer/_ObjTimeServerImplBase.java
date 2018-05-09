package TestTimeServer;

/**
* TestTimeServer/_ObjTimeServerImplBase.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从TestTimeServer.idl
* 2018年5月10日星期四 中国标准时间 上午12:39:48
*/

public abstract class _ObjTimeServerImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements TestTimeServer.ObjTimeServer, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _ObjTimeServerImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getTime", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // TestTimeServer/ObjTimeServer/getTime
       {
         String $result = null;
         $result = this.getTime ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:TestTimeServer/ObjTimeServer:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _ObjTimeServerImplBase
