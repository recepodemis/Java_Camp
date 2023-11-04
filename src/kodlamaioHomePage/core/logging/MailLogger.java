package kodlamaioHomePage.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data){
        System.out.println("Data logged at Mail: "+data);
    }
}
