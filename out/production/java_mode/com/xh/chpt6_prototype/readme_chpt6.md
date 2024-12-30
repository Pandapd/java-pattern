### Prototype设计模式

* 对象种类繁多，无法将他们整合到一个类中时
* 生成对象过程比较复杂，那么可以预先准备好对象的**原型**进行复制

在这里

> Manager类调用方法生成实现了Product接口的类的对象，但是他是不知道要复制什么对象的，MessageBox和UnderlinePen是两个实现了Product接口的类

注意：1、需要继承Java中的Cloneable类【但是注意clone()方法是浅复制】 
2、需要有一个注册机制（HashMap）,注册到Manager中，然后注册Map中保存的都是<String,原型类的对象>的键值对
