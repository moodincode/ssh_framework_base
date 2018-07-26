package com.moodincode.dao.impl;

import com.moodincode.dao.UserDao;
import com.moodincode.entity.User;
import org.hibernate.SessionFactory;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * createBy: moodincode
 * createDate: 2018/7/23 14:45
 * lastModifyDate: 2018/7/23 14:45
 * description:
 */
@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Resource(name="sessionFactory")
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }
    @Transactional
        @Override
    public void save(User user) {
        getHibernateTemplate().save(user);

    }
@Transactional
    @Override
    public void update(User user) {
    getHibernateTemplate().update(user);

    }

    @Override
    public User getById(Serializable id) {
        getHibernateTemplate().setCacheQueries(true);//设置开启缓存查询
        return (User) getHibernateTemplate().get(User.class,id);
    }

    @Override
    public List<User> findAll() {
            getHibernateTemplate().setCacheQueries(true);
            //此处开启缓存开启，能缓存数据，但是在此查询还是查询数据库，估计其需要通过key查找造成的，此处findAll没有指定key
        return (List<User>)getHibernateTemplate().loadAll(User.class);

       // return null;
    }
}
