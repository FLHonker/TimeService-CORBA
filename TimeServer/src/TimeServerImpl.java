//ObjTimeServerImpl.java

import org.omg.CORBA.*;
import TestTimeServer.*;
import java.util.Date;

class TimeServerImpl extends _ObjTimeServerImplBase
{
	//Variables
	//Constructor
	TimeServerImpl() 
	{
		super();
	}
	//Method (Service) Implementation
	public String getTime()	//throws Exception
	{
		return "Time: " + new Date().toString();
	}
};
