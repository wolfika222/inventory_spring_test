package hu.helixlab.inventory.repository;

import hu.helixlab.inventory.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IDeviceRepository extends JpaRepository<Device, Serializable> {
}
