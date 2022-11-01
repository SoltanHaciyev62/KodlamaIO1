package dataAcces;

import Entities.Category;
import Entities.Courses;

public class HibernateCourseDao implements  CourseDao,CategoryDao{
    @Override
    public void add(Courses courses) {
        System.out.println("hibernate ile veritabina eklendi :" +courses.getCourseName());
    }

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabainan eklendi :"+ category.getCategoryName());
    }
}
