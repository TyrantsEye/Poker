/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Baraja {

    String palos[] = {"Picas", "Diamantes", "Corazones", "Treboles"};
    String numeros[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "nueve", "Diez", "Jack", "Queen", "King"};
    Carta C1= new Carta();
    Carta C2= new Carta();
    Carta C3= new Carta();
    Carta C4= new Carta();
    int cont=0;
    Carta Baraja[] = new Carta[52];

    void crearBaraja() {
        int cont = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Baraja[cont] = new Carta();
                Baraja[cont].numero = numeros[j];
                Baraja[cont].palo = palos[i];
                cont++;
            }
        }
    }

    void barajar() {
        Carta Carta = new Carta();
        int p1, p2, p3;
        p1 = (int) (Math.random() * 1000);
        for (int i = 0; i < p1; i++) {
            p2 = (int) (Math.random() * 52);
            p3 = (int) (Math.random() * 52);
            Carta.numero = Baraja[p2].numero;
            Carta.palo = Baraja[p2].palo;
            Baraja[p2].numero = Baraja[p3].numero;
            Baraja[p2].palo = Baraja[p3].palo;
            Baraja[p3].numero = Carta.numero;
            Baraja[p3].palo = Carta.palo;

        }
        for (int j = 0; j < 52; j++) {
            System.out.println(Baraja[j].numero+"  "+Baraja[j].palo);
        }
    }

    void repartir() {
        
        C1.numero = Baraja[cont].numero;
        C1.palo = Baraja[cont].palo;
        C2.numero = Baraja[cont+1].numero;
        C2.palo = Baraja[cont+1].palo;
        C3.numero = Baraja[cont+2].numero;
        C3.palo = Baraja[cont+2].palo;
        C4.numero = Baraja[cont+3].numero;
        C4.palo = Baraja[cont+3].palo;
        cont=cont+4;
    }
}
