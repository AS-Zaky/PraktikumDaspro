package Quiz2;

public class Flowchart1 {
    public static void main(String[] args) {

        char[] huruf = {
            'A','B','C','D','E',
            'F','G','H','I','J',
            'K','L','M','N','O'
        };

        int i = 0;

        while (i < 5) {
            System.out.println(huruf[i] + " " + huruf[i + 5] + " " + huruf[i + 10]);
            i++;
        }
    }
}
