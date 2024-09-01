package jp.dressigroom;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyEntityRepository implements PanacheRepository<MyEntity> {
    public MyEntity findById(Long id) {
        return find("id", id).firstResult();
    }
}