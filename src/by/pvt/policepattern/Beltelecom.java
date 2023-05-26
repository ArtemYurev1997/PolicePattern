package by.pvt.policepattern;

public class Beltelecom extends Operator implements Observer {
    public Beltelecom(String message) {
        super(message);
    }

    @Override
    public void generate(String message) {
        System.out.println("Звонить всем абонентам и уведомлять об опасности мошенников: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение отправлено от Beltelecom! " + message);
    }
}
