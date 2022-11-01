package bussines;

import Entities.Category;
import dataAcces.CategoryDao;
import dataAcces.Ilogger;

import java.util.List;

public class CategoryManager {

    CategoryDao categorydao;
    List<Category> categories;
    Ilogger[] iloggers;

    public CategoryManager(CategoryDao categorydao, List<Category> categories, Ilogger[] iloggers) {
        this.categorydao = categorydao;
        this.categories = categories;
        this.iloggers = iloggers;
    }


    public void addCategory(Category category) throws Exception {
        for (Category category1 : categories) {
            if (category.getCategoryName().equals(category1.getCategoryName())) {
                throw new Exception("categori ismi ayni olamaz");
            }

        }
        categorydao.add(category);
        for (Ilogger ilogger : iloggers) {
            ilogger.log(category.getCategoryName());
        }
    }

}
