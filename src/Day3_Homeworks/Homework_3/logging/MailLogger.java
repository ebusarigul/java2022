package Day3_Homeworks.Homework_3.logging;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi = " + data);
    }
}
