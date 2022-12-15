适配器模式（adapter,wrapper）
实现方式有两种：继承（class），委托（interface/abstract）
作用：
    通过接口或者类将指定实体类进行包装，在这个类的基础上加以修饰，使其能用于其他用途。
    这个起包装作用的接口或者类被称为包装类或者适配器。
流程：
    source(源) -> adapter(适配【继承，委托】) -> target(目标)