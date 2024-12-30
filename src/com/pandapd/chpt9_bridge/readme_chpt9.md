### Bridge

#### 分离类的**功能层次结构**和**实现层次结构**


* 类的功能层次结构

为了添加新的功能，不断增加子类，这种方式就是类的功能层次结构

我们有了 
Something
    |____GoodSomething

有新功能需要添加，于是增加了BetterSomething
Something
    |____GoodSomething
            |____BetterSomething

* 类的实现层次结构
我们有了x cv
Something
    |____GoodSomething

需要增加新的实现，于是
Something
    |____GoodSomething
    |____BadSomething


#### 示例程序

在示例中，Display类就是那个桥梁，将实现层次结构（StringDisplayImpl）和功能层次结构（MutiDisplay）分离，并以自身座位桥梁将他们连接。
