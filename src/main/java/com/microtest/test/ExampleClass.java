package com.microtest.test;
// Интерфейсы
// Синтаксис определения интерфейса:
// <модификатор доступа> interface <имя> extends <базовый интерфейс> {
//        // Константы
//        // Определение методов.
//}

// В Java Вы можете наследоватьтолько один класс, однако можете реализовывать
// несколько интерфейсов. Например:
public class ExampleClass extends ExampleClassParent implements InterfaceTwo {

    public int add(int p1,  int p2){
        return p1+p2;
    };
}
