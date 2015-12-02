package kata6;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class KATA6 {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Inicio");
        String nameFile = "C:\\Users\\usuario\\Downloads\\emails.txt";
        ArrayList<Person> arrayMail = MailList.readFile(nameFile);
        ArrayList<Person1> person = ListLoader.read();
        
        HistogramBuilder<Person> builder = new HistogramBuilder<>(arrayMail);
        HistogramBuilder<Person1> builder1 = new HistogramBuilder<>(person);
        
        Histogram<String> domains = builder.build(new Attribute<Person, String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });
        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {

            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });
        
        Histogram<String> dominios = builder1.build(new Attribute<Person1, String>() {

            @Override
            public String get(Person1 item) {
                return item.getMail().split("@")[1];
            }
        });
        Histogram<Float> pesos = builder1.build(new Attribute<Person1, Float>() {

            @Override
            public Float get(Person1 item) {
                return item.getPeso();
            }
        });
        Histogram<Character> genero = builder1.build(new Attribute<Person1, Character>() {

            @Override
            public Character get(Person1 item) {
                return item.getGenero().charAt(0);
            }
        });
   
        new HistogramDisplay(domains,"DOMINIOS").execute();
        new HistogramDisplay(letters,"CARACTER").execute();
        
        new HistogramDisplay(dominios,"DOMINIOS").execute();
        new HistogramDisplay(pesos,"PESOS").execute();
        new HistogramDisplay(genero,"GENERO").execute();
        
        System.out.println("Fin");
    }
    
}
