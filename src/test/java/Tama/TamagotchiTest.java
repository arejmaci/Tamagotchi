package Tama;

import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {

    @Test
    public void testQuePruebaQuePuedoCrearUnTama() {
     Tamagotchi tama = new Tamagotchi();
     Assert.assertNotNull(tama);
    }
    @Test
    public  void testQuePruebaQuePuedoCrearUnTamaConNombre(){

        Tamagotchi tama = new Tamagotchi("Cris");
        String obtenido = tama.getNombre();
        String esperado = "Cris";
        Assert.assertEquals(obtenido, esperado);

   }

   @Test
   public  void testParaCrearDosTamasConDistintoNombre(){
        Tamagotchi tama1 = new Tamagotchi("Cris");
        Tamagotchi tama2 = new Tamagotchi("Cleo");
        String obtenido1 = tama1.getNombre();
        String esperado1 = "Cris";

        String obtenido2 = tama2.getNombre();
        String esperado2 = "Cleo";

        Assert.assertEquals(obtenido1, esperado1);
        Assert.assertEquals(obtenido2, esperado2);

    }
}
