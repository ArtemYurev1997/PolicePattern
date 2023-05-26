package by.pvt.policepattern;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new Velcom("Velcom");
        Observer observer2 = new Mts("Mts");
        Observer observer3 = new Beltelecom("Beltelecom");
        Observer observer4 = new Life("Life");
        Police police = Police.getInstance();
        police.addObserver(observer1);
        police.addObserver(observer2);
        police.addObserver(observer3);
        police.addObserver(observer4);
        police.print("\"Опасность мошенников!\"");
    }
}
