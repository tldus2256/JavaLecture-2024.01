package src.ch06_class.sec03_calculate;

public class Card {
private int cash;
private int age;


public Card() { }

public Card(int cash, int age) {
	this.cash = cash;
	this.age = age;
}

@Override
public String toString() {
	return "Card [cash=" + cash + ", age=" + age + "]";
}

public int getCash() {
	return cash;
}

public void setCash(int cash) {
	this.cash = cash;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


}
