package hu.helixlab.inventory.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "device", schema = "public")
@Data
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, insertable = false)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "bar_code")
    private long barCode;
    @Column(name = "rooms_number")
    private int roomsNumber;
    @Column(name = "human_name")
    private String humanName;
    @Column(name = "inv_date")
    private Date invDate;
}
