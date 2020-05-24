package edu.wctc.dao;

import edu.wctc.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> getCategories() {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        // Get list of donuts from query
        List<Category> categoryList = session.createQuery("from Category", Category.class).getResultList();

        // Return results
        return categoryList;
    }

    @Override
    public void saveCategory(Category theCategory) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        // save/update the donut
        session.saveOrUpdate(theCategory);
    }

    @Override
    public Category getCategory(int theId) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        return session.get(Category.class, theId);
    }

    @Override
    public void deleteCategory(int theId) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        // Delete object using primary key
        Query query = session.createQuery("delete from Category where id = :doomedCategoryId");
        // Set parameter value
        query.setParameter("doomedCategoryId", theId);

        // Perform the delete
        query.executeUpdate();
    }
}
