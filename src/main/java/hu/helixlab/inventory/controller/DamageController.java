package hu.helixlab.inventory.controller;

import hu.helixlab.inventory.model.Damage;
import hu.helixlab.inventory.repository.IDamageRepository;
import hu.helixlab.inventory.request.AddDamageDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/damage")
public class DamageController {

    private IDamageRepository damageRepository;

    @Autowired
    public DamageController(IDamageRepository damageRepository) {
        this.damageRepository = damageRepository;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Damage> findAllDamage() {
        return damageRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addDamageDescription(@RequestBody AddDamageDescription addDamageDescription) {
        Damage damage = new Damage();
        damage.setDescription(addDamageDescription.getDamageDescription());
        damageRepository.save(damage);
    }
}
