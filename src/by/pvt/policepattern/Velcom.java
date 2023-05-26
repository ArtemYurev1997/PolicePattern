package by.pvt.policepattern;

public class Velcom extends Operator implements Observer {
    public Velcom(String message1) {
        super(message1);
    }

    @Override
    public void generate(String message) {
        System.out.println("Отправлять смски об опасности мошенников: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение отправлено от Velcom! " + message);
    }
}
