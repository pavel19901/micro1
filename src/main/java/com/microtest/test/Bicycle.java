package com.microtest.test;
class Bicycle {

    // Поля/Переменные класса Bicycle.
    
    public int cadence;// Публичные(public): Доступны из любого места.
    private int speed; // Приватные(private): Доступны только внутри класса.
    protected int gear;// Защищенные(protected): Доступ из класса и наследников.
    String name; // по умолчанию: Доступны только внутри пакета.

    // Конструкторы - способ создания класса.
    // Это конструктор:
    public Bicycle() {
        gear = 1;
        cadence = 50;
        speed = 5;
        name = "Bontrager";
    }

    // Это конструктор, который принимает аргументы:
    public Bicycle(int startCadence, int startSpeed, int startGear, String name) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.name = name;
    }

    // Синтаксис функций:
    // <public/private/protected> <тип возвращаемого значения> <имя>(<аргументы>)

    // Классы в Java часто реализуют сеттеры и геттеры для своих полей.

    // Синтаксис определения метода:
    // <модификатор> <тип возвращаемого значения> <имя>(<аргументы>)
    public int getCadence() {
        return cadence;
    }

    // void-методы не возвращают значений.
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void slowDown(int decrement) {
        speed -= decrement;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    //Метод для отображения значений атрибутов объекта.
    @Override
    public String toString() {
        return "gear: " + gear +
                " cadence: " + cadence +
                " speed: " + speed +
                " name: " + name;
    }
} // конец класса Bicycle.

