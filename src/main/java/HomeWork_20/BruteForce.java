package HomeWork_20;

public class BruteForce {
//    very simple (настоящее слово длиной 4 символа)
//
//    f016441d00c16c9b912d05e9d81d894d - very
//
//    simple (настоящее слово) - secret
//
//5ebe2294ecd0e0f08eab7690d2a6ee69
//
//    stronger (только буквы нижнего регистра)
//
//13d70e09909669272b19647c2a55dacb
//
//    strongest (буквы и вспомогательные символы)
//
//5f50dfa5385e66ce46ad8d08a9c9be68

    private static String password = "5ebe2294ecd0e0f08eab7690d2a6ee69";
    private static StringBuilder string = new StringBuilder("");
    private static int min = 97, max = 122;
    private static long start;

    public static void loop(int index) throws Exception {
        for(int i = min; i < max; i++) {
            string.setCharAt(index, (char) i);
            if(index < string.length() - 1)
                loop(index + 1);
            Md5Hash temp = new Md5Hash(string.toString());
            String pass = temp.Md5Hash().toLowerCase();
            System.out.println(string);
            if(pass.equals(password)) {
                System.err.println("password found: " + string);
                System.err.println("It took: " + convertmillis(System.currentTimeMillis() - start));
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        start = System.currentTimeMillis();
        while(true) {
            string.append((char) min);

            for(int i = 0; i < string.length() - 1; i++) {
                for(int j = min; j  < max; j++) {
                    string.setCharAt(i, (char) j);
                    loop(i + 1);
                }
            }
        }
    }

    public static String convertmillis(long input) {
        int days = 0, hours = 0, minutes = 0, seconds = 0, millis = 0;

        int day = 86400000;
        int hour = 3600000;
        int minute = 60000;
        int second = 1000;


        if(input >= day) {
            days = (int) (input / day);
            millis = (int) (input % day);
        } else
            millis = (int) input;

        if(millis >= hour) {
            hours = millis / hour;
            millis = millis% hour;
        }

        if(millis >= minute) {
            minutes = millis / minute;
            millis = millis % minute;
        }

        if(millis >= second) {
            seconds = millis / second;
            millis = millis % second;
        }

        return (days  + " day(s), " + hours + "h, " + minutes + "min, " + seconds + "s and " + millis + "ms");
    }
}
