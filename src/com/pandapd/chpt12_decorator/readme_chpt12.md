### Decorator模式

#### roles

1. Component：功能定义时的核心角色API，即示例中的Display
2. ConcreteComponent: 具体的核心。
3. Decorator: 装饰物，这里指的是Boarder（API）,注意Boarder仍然是继承了Display。
4. ConcreteDecorator：具体的装饰物，SiderBoarder，StringBoarder等类。


#### 描述

蛋糕
奶油（蛋糕）奶油
草莓{ 奶油（蛋糕）奶油 }草莓
