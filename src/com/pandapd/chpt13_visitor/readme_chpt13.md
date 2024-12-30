### Visitor模式

#### roles

1. Visitor:访问者

2. ConcreteVisitor：具体的访问者，即示例中的ListVisitor
 
3. Element: 元素，需要接受Visitor的访问

4. ConcreteElement：具体的元素，示例代码中的File和Directory

5. ObjectStructure：处理Element集合的角色，示例程序中，Directory也扮演了该角色，提供了`Iterator()`这样处理Element集合的方法。


#### 优缺点

* 双重分发
Element accept了Visitor，Visitor反过来访问Element。这样的消息处理机制称作双重分发。

* 将“处理”和“数据”分开来。

容易增加处理方式，如XXXVisitor,**但是**增加Element的种类后，Visitor中要增加visit(XXXElemnet)的方法，然后所有子类都要增加，比较繁琐。
