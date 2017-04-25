/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.animeaux.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class AnimeauxTest {

    @Test
    public void testAnimeaux() {
        List<Animal> animeaux = new ArrayList<Animal>();
        Animal poissonRouge = new Poisson("poissonRoug");
        animeaux.add(poissonRouge);
        Animal balaine = new Poisson("wili");
        animeaux.add(balaine);
        Animal canari = new Oiseau("canari");
        animeaux.add(canari);
        Animal pigeon = new Oiseau("pigeon");
        animeaux.add(pigeon);

        for (Animal a : animeaux) {
            a.bouger();
            a.parler();
        }

    }

}
