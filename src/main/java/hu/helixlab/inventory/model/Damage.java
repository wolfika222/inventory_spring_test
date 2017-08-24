package hu.helixlab.inventory.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "damage", schema = "public")
@Data
public class Damage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, insertable = false)
    private long id;
    @Column(name = "device_code")
    private long deviceCode;
    @Column(name = "device_name")
    private String deviceName;
    @Column(name = "description")
    private String description;
    @Column(name = "dam_time")
    private Date damTime;
}
