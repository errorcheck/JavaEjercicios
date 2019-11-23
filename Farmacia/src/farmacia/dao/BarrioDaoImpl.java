/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.dao;

import farmacia.FarmaciaHibernateUtil;
import farmacia.modelo.Barrio;
import farmacia.modelo.Farmacia;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author spardo
 */
public class BarrioDaoImpl implements BarrioDao {

    private final SessionFactory sessionFactory;

    public BarrioDaoImpl() {
        sessionFactory = FarmaciaHibernateUtil.getSessionFactory();
    }

    @Override
    public List<Barrio> getByComuna(Long comunaId) {
        Session session = sessionFactory.openSession();

        return session.createCriteria(Barrio.class,"barrio").createAlias("barrio.comuna", "comuna").add(Restrictions.eq("comuna.id", comunaId)).list();
    }

}
