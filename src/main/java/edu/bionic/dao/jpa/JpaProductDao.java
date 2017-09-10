package edu.bionic.dao.jpa;

import edu.bionic.dao.ProductDao;
import edu.bionic.domain.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public class JpaProductDao implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAll() {
        return entityManager.createQuery("SELECT p FROM Product p", Product.class)
                .getResultList();
    }

    @Override
    public List<Product> getAllSortedByName(String name, BigDecimal min, BigDecimal max, boolean desc, int offset, int limit) {
        TypedQuery<Product> query = this.entityManager.createQuery("SELECT p FROM Product p " +
                "WHERE p.name LIKE :name " +
                "AND (:min is NULL OR p.price >= :min) " +
                "AND (:max is NULL OR p.price <= :max) " +
                "ORDER BY p.name " + (desc ? "DESC " : "ASC "), Product.class);

        query.setParameter("name", StringUtils.isEmpty(name) ? "%" : "%" + name + "%");
        query.setParameter("min", min);
        query.setParameter("max", max);
        query.setFirstResult(offset);
        query.setMaxResults(limit);

        return query.getResultList();
    }

    @Override
    public List<Product> getAllSortedByPrice(String name, BigDecimal min, BigDecimal max, boolean desc, int offset, int limit) {
        TypedQuery<Product> query = this.entityManager.createQuery("SELECT p FROM Product p " +
                "WHERE p.name LIKE :name " +
                "AND (:min is NULL OR p.price >= :min) " +
                "AND (:max is NULL OR p.price <= :max) " +
                "ORDER BY p.price " + (desc ? "DESC " : "ASC "), Product.class);

        query.setParameter("name", StringUtils.isEmpty(name) ? "%" : "%" + name + "%");
        query.setParameter("min", min);
        query.setParameter("max", max);
        query.setFirstResult(offset);
        query.setMaxResults(limit);

        return query.getResultList();
    }

    @Override
    public int getCount(String name, BigDecimal min, BigDecimal max) {
        TypedQuery<Long> query = this.entityManager.createQuery("SELECT COUNT(p) FROM Product p " +
                "WHERE p.name LIKE :name " +
                "AND (:min is NULL OR p.price >= :min) " +
                "AND (:max is NULL OR p.price <= :max) ", Long.class);
        query.setParameter("name", StringUtils.isEmpty(name) ? "%" : "%" + name + "%");
        query.setParameter("min", min);
        query.setParameter("max", max);

        return query.getSingleResult().intValue();
    }

    @Override
    public Optional<Product> getById(int productId) {
        Product product = entityManager.find(Product.class, productId);
        return Optional.ofNullable(product);
    }

    @Override
    @Transactional
    public Product save(Product product) {
        if (product.getId() == null) {
            entityManager.persist(product);
            return product;
        } else {
           return entityManager.merge(product);
        }
    }

    @Override
    @Transactional
    public boolean delete(int productId) {
        Query query = entityManager.createQuery("DELETE FROM Product p WHERE p.id = :product_id");
        query.setParameter("product_id", productId);

        return query.executeUpdate() != 0;
    }
}
