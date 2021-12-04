package com.example.fullint.DAO.Implementation;

import com.example.fullint.DAO.CourseDAO;
import com.example.fullint.bean.Courses;
import com.example.fullint.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public boolean addCourse(Courses course) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();
            session.save(course);
            t.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }
}
