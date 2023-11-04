package kodlamaioHomePage.core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data){
        System.out.println("Data logged at File: " + data);
    }
}
