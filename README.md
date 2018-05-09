# TimeService-CORBA

@author:Frank Liu
@email:frankliu624@gmail.com
@blog:<https://flhonker.github.io>

### 项目描述：

软件中间件与构件，基于CORBA的时间Server与Client程序，IOR
使用IDL描述接口，编译，客户端获得服务端对象IOR，调用并获得时间。
其中，[TestTimeServer.idl](./TestTimeServer.idl)文件是IDL接口描述文件。

### 实验环境

JDK1.8，Windows10_x64

### 运行方式

1. 打开一个cmd，运行一下命令打开名称服务器，使用1050 port：
> \> orbd -ORBInitialPort 1050

2. 进入TimeServer/bin，运行打开时间服务器：
> TimeServer\bin\> java TimeServer -ORBInitialPort 1050

3. 进入TimeClient/bin，运行打开时间客户端：
> TimeClient\bin\> java TimeClient -ORBInitialPort 1050

以上过程均在JDKK_1.8、Win10_x64环境下测试通过，如有异常错误，请进入相应的src文件夹先自行编译Java源码，谢谢！

### IDL介绍

IDL是用来描述软件组件接口的一种计算机语言。IDL通过一种中立的方式来描述接口，使得在不同平台上运行的对象和用不同语言编写的程序可以相互通信交流；比如，一个组件用C++写成，另一个组件用Java写成。CORBA接口作为服务对象功能的详细描述，封装了服务对象提供服务方法的全部信息，客户对象利用该接口获取服务对象的属性、访问服务对象中的方法。
