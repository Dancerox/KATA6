package kata6;

import java.io.IOException;
import java.util.ArrayList;

public class KATA6 {

    public static void main(String[] args) throws IOException {
        System.out.println("Inicio");
        String nameFile = "C:\\Users\\usuario\\Downloads\\emails.txt";
        ArrayList <Person> arrayMail = MailList.readFile(nameFile);
        System.out.println(arrayMail.size()); //260 mails en total
        HistogramBuilder<Person> builder = new HistogramBuilder<>(arrayMail);
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
        new HistogramDisplay(domains,"DOMINIOS").execute();
        new HistogramDisplay(letters,"CARACTER").execute();
        System.out.println("Fin");
    }
    
}
