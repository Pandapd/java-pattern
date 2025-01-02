### Mediator模式
仲裁者模式

#### role
1. Mediator:仲裁者，对Colleague通信做决定的API
2. ConcreteMediator ： 具体的仲裁者
3. Colleague：该角色对Mediator进行通信
4. ConcreteColleague：具体的Colleague



#### Mediator和Colleagues的通信

示例中仲裁者只设置了组件（Colleagues）的启用/禁止状态，仲裁者只下达简单的状态通知，如果有更详细的通信，还需要定义
更多方法，传送的消息也会更加复杂。

