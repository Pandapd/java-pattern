### Abstract Factory

#### roles

抽象的工厂部分
1. AbstractFactory：抽象的工厂
2. AbstractProduct：抽象的产品（由抽象的零件组成）
3. AbstractItem1：抽象的零件1
4. AbstractItem2：抽象的零件2 
5. AbstractItem3：抽象的零件3

其中的Item1,2,3可以选取全部或一部分抽象出更底层的抽象零件类

具体的工厂部分
1. ConcreteFactory（继承或实现了AbstractFactory）:具体的零件生产工厂
2. ConcreteProduct：具体的产品
3. ConcreteItem1（继承或实现了AbstractItem1）：具体的零件1
4. ConcreteItem2（继承或实现了AbstractItem2）：具体的零件2
....


代码中的抽象零件有
item：所有有名字的标签对象
Link：继承item(比如具体的零件`<a>`标签)
Tray(托盘)：继承item，带有name，同时可以嵌套的标签对象（比如具体的零件`<li>`标签）
page：网页对象（产品对象）

```html

<html lang="html">
<head>
    <title>Abstract Factory</title>
<body>
<title>LinkPage</title>
<ul>
    <li>Alibaba
    <li><a href="http://www.taobao.com">淘宝</a></li>
    <li><a href="http://www.tianmao.com">天猫</a></li>
    </li>
</ul>
</body>
</head>
</html>
```


##### 注意

Tray中的`trayList`和Page中的`contentList`属性比较，设置为`private`安全性更高，但是要设置对应的`getter()`方法
