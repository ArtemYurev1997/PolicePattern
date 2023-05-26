package by.pvt.policepattern;

public class Mts extends Operator implements Observer{
    public Mts(String message) {
        super(message);
    }

    @Override
    public void generate(String message) {
        System.out.println("Отправлять уведомление об опасности мошенников на все смартфоны: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение отправлено от Mts! " + message);
    }
}
