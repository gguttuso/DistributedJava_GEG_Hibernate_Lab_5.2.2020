package edu.wctc.dao;

import edu.wctc.entity.ItemDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDetailDAOImpl implements ItemDetailDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<ItemDetail> getItemDetails() {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        // Get list of donuts from query
        List<ItemDetail> itemDetailList = session.createQuery("from ItemDetail", ItemDetail.class).getResultList();

        // Return results
        return itemDetailList;
    }

    @Override
    public void saveItemDetail(ItemDetail theItemDetail) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        // save/update the donut
        session.saveOrUpdate(theItemDetail);
    }

    @Override
    public ItemDetail getItemDetail(int theId) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        return session.get(ItemDetail.class, theId);
    }

    @Override
    public void deleteItemDetail(int theId) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        // Delete object using primary key
        Query query = session.createQuery("delete from ItemDetail where id = :doomedItemDetailId");
        // Set parameter value
        query.setParameter("doomedItemDetailId", theId);

        // Perform the delete
        query.executeUpdate();
    }

}
