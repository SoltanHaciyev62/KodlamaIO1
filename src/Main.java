import Entities.Category;
import Entities.Courses;
import Entities.Instuctor;
import Logging.DBLogger;
import Logging.FileLogger;
import Logging.MailLogger;
import bussines.CategoryManager;
import bussines.CourseManager;
import dataAcces.CourseDao;
import dataAcces.HibernateCourseDao;
import dataAcces.Ilogger;
import dataAcces.JDBCCourseDao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Instuctor instuctor = new Instuctor(1, "Engin", "Demirog");
        System.out.println("Kurs ogretmeni : " + instuctor.getName());



      List<Courses> courses = new ArrayList<>();
      courses.add(new Courses("Java",163));
      courses.add(new Courses("Pyhton",156));

        Ilogger[] iloggers = {new DBLogger(), new FileLogger(), new MailLogger()};

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1,"Backend programming"));
        categories.add(new Category(2,"Frontend Progrraming"));
        CategoryManager categoryManager = new CategoryManager(new JDBCCourseDao(),categories,iloggers);
        categoryManager.addCategory(new Category(3,"Fullstack programming"));


        CourseManager courseManager = new CourseManager(courses,iloggers,new HibernateCourseDao());
        courseManager.add(new Courses("C++",140)); // yeni kur eklendi
        courseManager.add(new Courses("Java",120 )); // Exception icin




    }
}