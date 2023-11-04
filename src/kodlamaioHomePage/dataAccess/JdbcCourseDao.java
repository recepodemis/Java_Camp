package kodlamaioHomePage.dataAccess;

public class JdbcCourseDao implements CourseDao{

    @Override
    public void addCourse(String lesson) {
        System.out.println("Course added with JDBC: " + lesson);
    }
}
