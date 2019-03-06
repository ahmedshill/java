public class string2 {
    public static void main(String[] args) {
        String mpesa = "JSIJIJ223J confirmed. Ksh 90.00 sent to ahmed shill" + "+25472215967 on 28/2/19 at 2121hrs. new M-PESA balance is" +  "Ksh 32400. Transaction cost, Ksh 15.00";

        int pos_Ksh = mpesa.indexOf("Ksh");
        int pos_sent = mpesa.indexOf("sent");
        String amount = mpesa.substring(pos_Ksh, pos_sent);
        System.out.println(amount);
        int pos_on = mpesa.indexOf(" on ")+3;
        int pos_at = mpesa.indexOf(" at");
        String name = mpesa.substring(pos_on, pos_at);
        System.out.println(name);
        int pos_is = mpesa.indexOf(" is")+3;
        int pos_Transaction = mpesa.indexOf("Transaction");
        String balance = mpesa.substring(pos_is, pos_Transaction);
        System.out.println(balance);
    }
}
