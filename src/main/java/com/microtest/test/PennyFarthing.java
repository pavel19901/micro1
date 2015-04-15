package com.microtest.test;
// Вы можете включать другие, не публичные классы в .java файл.


// Синтаксис объявления класса:
// <public/private/protected> class <имя класса>{
//    // Поля с данными, конструкторы, функции, все внутри.
//    // Функции называют методами в Java.
// }


// PennyFarthing - это класс, наследованный от Bicycle
class PennyFarthing extends Bicycle {
    // (Penny Farthings - это такие велосипеды с большим передним колесом,
    // у них нет передач.)

    public PennyFarthing(int startCadence, int startSpeed){
        // Вызов конструктора родительского класса.
        super(startCadence, startSpeed, 0, "PennyFarthing");
    }

    // Вы должны пометить метод, который переопределяете, при помощи @аннотации
    // Чтобы узнать о том, что такое аннотации и зачем они нужны, почитайте:
    // http://docs.oracle.com/javase/tutorial/java/annotations/
    @Override
    public void setGear(int gear) {
        gear = 0;
    }

}

