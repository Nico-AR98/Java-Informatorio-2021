import java.util.ArrayList;
import java.util.Collections;

public class ejercicio3 {

    public static void main(String[] args) {
        
        ArrayList< String> cartasFrancesas = new ArrayList<String>();

        String [] palos = new String [] {"C","D","T","P"};
        //C(corazones),D(diamantes),T(treboles),P(picas)

        String [] cartasConLetras = new String [] {"J","Q","K","A"};


        for(int i=2;i<=10;i++){

            for (int a=0;a<4;a++) {

                cartasFrancesas.add(String.valueOf(i)+palos[a]);
                cartasFrancesas.add(cartasConLetras[a]+palos[a]);

            }
        }

        for (int i=0;i<cartasFrancesas.size();i++) {
            System.out.println(cartasFrancesas.get(i));
        }

        System.out.println();

        Collections.reverse(cartasFrancesas);
        
        for (String carta:cartasFrancesas){
            System.out.println(carta);
        }

        Collections.shuffle(cartasFrancesas);

        System.out.println();

        for (String carta:cartasFrancesas){
            System.out.println(carta);
        }

    }

}