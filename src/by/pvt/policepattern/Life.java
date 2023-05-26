package by.pvt.policepattern;

public class Life extends Operator implements Observer{
    public Life(String message) {
        super(message);
    }

    @Override
    public void generate(String message) {
        System.out.println("Отправлять сообщения чере каждые 10 минут об опасности мошенников: " + message );
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение отправлено от Life! " + message);
    }
}
