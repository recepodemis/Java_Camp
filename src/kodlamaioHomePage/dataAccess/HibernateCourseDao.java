package kodlamaioHomePage.dataAccess;

public class HibernateCourseDao implements CourseDao {

    @Override
    public void addCourse(String lesson) {
        System.out.println("Course added with Hibernate: " + lesson);
    }
}
