package uk.co.placona.helloWorld;

/**
 * @author Peter Yu 2019/7/24 15:32
 */
public class FindbugsDemo2 {

    public static void main(String[] args) {
        int a = 0;

        if (a == 1) {
            while (true) {
                System.out.println("haha");

            }
        }
    }
}
