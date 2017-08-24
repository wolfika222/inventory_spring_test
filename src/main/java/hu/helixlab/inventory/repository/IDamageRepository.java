package hu.helixlab.inventory.repository;

import hu.helixlab.inventory.model.Damage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IDamageRepository extends JpaRepository<Damage, Serializable> {
}
