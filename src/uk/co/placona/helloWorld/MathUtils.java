package uk.co.placona.helloWorld;

/**
 * This is a util for junit test
 *
 * @author Peter Yu 2019/7/23 17:19
 */
public class MathUtils {

    public static int add(int a, int b) {
        if(a>0 && b>0){
            return a + b;
        }else {
            return 0;
        }
    }

    public static int minus(int a, int b) {
        return a - b;
    }
}
