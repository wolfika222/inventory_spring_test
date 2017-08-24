package hu.helixlab.inventory.request;

import lombok.Data;

@Data
public class AddDeviceRequest {

    private String name;
    private long barCode;
    private int roomsNumber;
    private String humanName;
}
