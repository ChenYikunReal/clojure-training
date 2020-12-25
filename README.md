# Clojure练习记录

> 以下介绍内容摘自《Clojure in Action》
> Clojure是一种简单、精炼的编程语言，其设计的目的是轻松地同时利用遗留代码和现代化多核处理器。
> Clojure的简单性在于稀少而有规律的语法，精炼则源于动态类型和函数式编程。
> Clojure可以很好的利用Java程序库，因为它以JVM为宿主。
> Clojure以不可变数据结构和提供强大的并发结构简化了多线程编程。

![](images/clojure.jpg)

## Clojure特点
- 函数当成第一等公民
- 具有引用透明性的纯函数
- 默认不可变数据结构
- 支持对状态的受控、显式更改
- 托管于现有平台（如`.NET CLR`、`JVM`）
- 引入Lisp的括号机制等语法
- 表达式的前缀表示法
- 使用括号分隔代码块
- 不需要使用逗号分隔列表元素而是使用空格即可
- 行首逗号表示行注释
- 大小写敏感
- 除了`false`和`nil`以外都是`true`
