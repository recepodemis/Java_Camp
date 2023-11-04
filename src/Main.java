import kodlamaioHomePage.business.CourseManager;
import kodlamaioHomePage.content.Course;
import kodlamaioHomePage.core.logging.DatabaseLogger;
import kodlamaioHomePage.core.logging.FileLogger;
import kodlamaioHomePage.core.logging.Logger;
import kodlamaioHomePage.core.logging.MailLogger;
import kodlamaioHomePage.dataAccess.HibernateCourseDao;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {

        Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı-JS","JavaScript kullanarak bir kamp gerçekleştirilecektir",
                "Engin Demirog",1500,"Js Kamp");
        Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı-JAVA","java kullanarak bir kamp gerçekleştirilecektir.",
                 "Halit Enes Kalaycı",1400,"Java Kamp");
        Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1,loggers);
        courseManager.add(course2,loggers);


    }
}