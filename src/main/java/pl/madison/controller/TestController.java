package pl.madison.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.madison.dao.CzlowiekDao;
import pl.madison.dao.PokojDao;
import pl.madison.domain.Czlowiek;
import pl.madison.domain.Pokoj;

@RestController
public class TestController {

    @Autowired
    private PokojDao pokojDaoo;
    private CzlowiekDao czlowiekDaoo;

    @RequestMapping(value = "/wyswietlMieszkancow", method = RequestMethod.GET)
    public String wyswietlPokoje(){
        String czlowiek = "";

        for (Czlowiek czlowiek1 : czlowiekDaoo.findAll()) {
            czlowiek = czlowiek + czlowiek1;
        }

        return czlowiek;
    }
}
