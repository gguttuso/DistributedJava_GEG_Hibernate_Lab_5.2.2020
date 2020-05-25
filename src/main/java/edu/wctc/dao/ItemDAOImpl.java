package edu.wctc.dao;

import edu.wctc.entity.Item;
import edu.wctc.entity.ItemDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public class ItemDAOImpl implements ItemDAO {
        @Autowired
        private SessionFactory sessionFactory;

        @Override
        public List<ItemDetail> getItems() {
            // Get current Hibernate session
            Session session = sessionFactory.getCurrentSession();

            // Get list of donuts from query
            List<ItemDetail> itemList = session.createQuery("from Item", Item.class).getResultList();

            // Return results
            return itemList;
        }

        @Override
        public void saveItem(Item theItem) {
            // Get current Hibernate session
            Session session = sessionFactory.getCurrentSession();

            // save/update the donut
            session.saveOrUpdate(theItem);
        }

        @Override
        public Item getItem(int theId) {
            // Get current Hibernate session
            Session session = sessionFactory.getCurrentSession();

            return session.get(Item.class, theId);
        }

        @Override
        public void deleteItem(int theId) {
            // Get current Hibernate session
            Session session = sessionFactory.getCurrentSession();

            // Delete object using primary key
            Query query = session.createQuery("delete from Item where id = :doomedItemId");
            // Set parameter value
            query.setParameter("doomedItemId", theId);

            // Perform the delete
            query.executeUpdate();
        }

        @Override
        public List<Item> getItemsByName(String theSearchTerm) {
            // Get current Hibernate session
            Session session = sessionFactory.getCurrentSession();

            // Add wildcards and make search term lowercase (for case insensitivity)
            theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

            Query<Item> query = session.createQuery("from Item where lower(name) like :nameToSearch");
            query.setParameter("nameToSearch", theSearchTerm);

            return query.getResultList();
        }
}
