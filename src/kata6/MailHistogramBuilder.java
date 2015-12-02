package kata6;

import java.util.ArrayList;

public class MailHistogramBuilder {

    public static Histogram build(ArrayList<String> mailList) {
        Histogram<String> histo = new Histogram<>();
        for (String mailList1 : mailList) {
            histo.increment(new Mail(mailList1).getDomain());
        }
        return histo;
    }

}
