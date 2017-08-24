package hu.helixlab.inventory.controller;

import hu.helixlab.inventory.model.Device;
import hu.helixlab.inventory.repository.IDeviceRepository;
import hu.helixlab.inventory.request.AddDeviceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {

    private IDeviceRepository deviceRepository;

    @Autowired
    public DeviceController(IDeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Device> findAllDevice(){
        return deviceRepository.findAll();
    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addNewDevice(@RequestBody AddDeviceRequest addDeviceRequest){
        Device device = new Device();
        device.setName(addDeviceRequest.getName());
        device.setBarCode(addDeviceRequest.getBarCode());
        device.setRoomsNumber(addDeviceRequest.getRoomsNumber());
        device.setHumanName(addDeviceRequest.getHumanName());
        deviceRepository.save(device);
    }
}
