package ch7.p368;

class Product{
    int price;
    int bonusPoint;
}

class Tv extends Product{}
class Computer extends Product{}
class Audio extends Product{}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
}

public class PolyArgumentTest {
}
