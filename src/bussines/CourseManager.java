package bussines;

import Entities.Courses;
import dataAcces.CourseDao;
import dataAcces.Ilogger;

import java.util.List;

public class CourseManager {

    List<Courses>  course;
    CourseDao courseDao;
    Ilogger [] ilogger;

    public CourseManager(List<Courses> courses, Ilogger[] ilogger, CourseDao courseDao) {
        this.course=courses;
        this.ilogger = ilogger;
        this.courseDao= courseDao;
    }

    public void add(Courses courses) throws Exception {

        for (Courses course_ : course) {
            if (courses.getCourseName().equals(course_.getCourseName())) {
                throw new Exception("Course name can  not be the same");
            } else if (courses.getCoursePrice() <=0) {
                throw new Exception("Kurs fiyati 0 olamaz  ");

            }
        }


        courseDao.add(courses);

        for (Ilogger ilogger1 : ilogger){
            ilogger1.log(courses.getCourseName());
        }
    }
}
