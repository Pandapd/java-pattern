### State模式

#### roles

1. State:状态
2. ConcreteState
3. Context: 状态前后关系。示例中由Context接口和StateFrame扮演该角色。

#### 示例程序

本来每次都需要进行白天与夜晚的时间判断，但是如果使用State模式，就是把“白天”和“夜晚”从*需要判断的状态*
转换为*类表示的状态*。

需要注意状态的切换，现在的程序是Context需要知道所有的Context角色。