package kata6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MailList {

    public static ArrayList readFile (String name) throws FileNotFoundException, IOException{
        ArrayList <Person> mailList = new ArrayList<>();
        
        BufferedReader filein = new BufferedReader(new FileReader(new File (name)));
        
        String mail;
        Integer id=0;
        while ((mail = filein.readLine())!= null){
            if (!mail.contains("@")) continue;
            //mailList.add(mail);
            mailList.add(new Person(id++, mail));
        }
        return mailList;
    }
    
}
