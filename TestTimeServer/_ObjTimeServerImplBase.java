package TestTimeServer;

/**
* TestTimeServer/_ObjTimeServerImplBase.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��TestTimeServer.idl
* 2018��5��10�������� �й���׼ʱ�� ����12:39:48
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
