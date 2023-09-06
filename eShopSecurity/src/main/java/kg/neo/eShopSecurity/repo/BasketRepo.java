package kg.neo.eShopSecurity.repo;

import kg.neo.eShopSecurity.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepo extends JpaRepository<Basket,Long> {
}
