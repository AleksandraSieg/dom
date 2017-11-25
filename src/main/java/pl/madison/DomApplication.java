package pl.madison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.madison.dao.CzlowiekDao;
import pl.madison.dao.PokojDao;
import pl.madison.domain.Czlowiek;
import pl.madison.domain.Pokoj;

@SpringBootApplication
public class DomApplication implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(DomApplication.class, args).start();
    }

    @Autowired
    CzlowiekDao repositoryCzlowiek;
    @Autowired
    PokojDao repositoryPokoj;

    public void run(String... strings) throws Exception {
        Czlowiek czlowiek1 = new Czlowiek();
        Czlowiek czlowiek2 = new Czlowiek();
        Czlowiek czlowiek3 = new Czlowiek();
        czlowiek1.setImie("Jola");
        czlowiek1.setWiek(30);
        repositoryCzlowiek.save(czlowiek1);
        czlowiek2.setImie("Mateusz");
        czlowiek2.setWiek(40);
        repositoryCzlowiek.save(czlowiek2);
        czlowiek3.setImie("Natasza");
        czlowiek3.setWiek(23);
        repositoryCzlowiek.save(czlowiek3);

        Pokoj pokoj1 = new Pokoj();
        Pokoj pokoj2 = new Pokoj();
        Pokoj pokoj3 = new Pokoj();
        pokoj1.setNazwa(czlowiek1);
        repositoryPokoj.save(pokoj1);
        pokoj2.setNazwa(czlowiek2);
        repositoryPokoj.save(pokoj2);
        pokoj3.setNazwa(czlowiek3);
        repositoryPokoj.save(pokoj3);
    }
}
