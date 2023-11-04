package kodlamaioHomePage.business;

import kodlamaioHomePage.content.Course;
import kodlamaioHomePage.core.logging.Logger;
import kodlamaioHomePage.dataAccess.CourseDao;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<String> courseNameList = new ArrayList<>();
    private List<String> courseCategoryList = new ArrayList<>();

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;

    }
    public void add(Course course, Logger[] loggers) throws Exception{
        if(courseNameList.contains(course.getName()))
        {
            throw new Exception("This course is already exist");
        }
        else if (courseNameList.contains(course.getCategory_name())){

            throw new Exception("This category is already exist");

        } else if (course.getPrice() <= 0 ) {

            throw new Exception("Course price can not be 0");

        } else {
            System.out.println("Courses added.");
            courseNameList.add(course.getName());
        }
        for (Logger logs:loggers) {
            logs.log(course.getName());
        }
    }

}
