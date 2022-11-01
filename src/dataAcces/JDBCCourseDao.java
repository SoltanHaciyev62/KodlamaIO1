package dataAcces;

import Entities.Category;
import Entities.Courses;

public class JDBCCourseDao implements CourseDao ,CategoryDao{
    @Override
    public void add(Courses courses) {
        System.out.println("JDBC ile veritabina eklendi" + courses.getCourseName());
    }

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanina eklendi :" + category.getCategoryName());
    }
}
