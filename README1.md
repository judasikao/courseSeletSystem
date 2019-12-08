# 实验  学生选课系统
###计172 李南峰 2017310456

本程序有采用MWC框架，前5个功能为对数据的操作，后4个功能为对数据的输出及保存，前后功能以数据为桥梁无直接联系。  
![](https://github.com/judasikao/courseSeletSystem/blob/master/360%E6%88%AA%E5%9B%BE20191208140129914.jpg) 
    
GUI主函数为类demo，私有成员为底层功能实现类Main。通过调用构造方法中添加Jbutton以及对按钮添加事件监听实现调用JDialog。  
![](https://github.com/judasikao/courseSeletSystem/blob/master/%E5%9B%BE%E7%89%871.png)  

数据修改的实现：  
通过JDialog中JTextField获取用户输入信息，再将数据传入类Main中的方法实现对数据的修改。  
数据输出的实现：  
通过类Main中方法获取数据，再将数据用JDialog中JTextArea输出实现对数据的输出。  
部分运行截图：  
![](https://github.com/judasikao/courseSeletSystem/blob/master/%E5%9B%BE%E7%89%872.png)  
  
![](https://github.com/judasikao/courseSeletSystem/blob/master/%E5%9B%BE%E7%89%873.png)  


感想：
本次选课系统的编写较为坎坷，因前期对类与类之间传递数据的理解不够透彻，在编写过程中出现了很多类的方法调用不成功的情况和一些意想不到的问题。通过学习，我初步掌握了如何去设计程序框架以及如何降低类与类之间的耦合度，方便后期程序扩展与更改。本程序还有许多亟待修改的地方，例如用数据库去储存数据等等。

	








