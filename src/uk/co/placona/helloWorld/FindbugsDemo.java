package uk.co.placona.helloWorld;

/**
 * @author Peter Yu 2019/7/24 14:14
 */
public class FindbugsDemo {

    public static void main(String[] args) {

        Bug bug = null;
        System.out.println(bug.report());
        Bug bug2 = getBug(false);
        System.out.println(bug2.report());

        }

    public static Bug getBug(boolean flag){
        if (flag) {
            return new Bug();
        }
        return null;
    }

    public static class Bug{
        int singleQuote = 0;
        int doubleQuote = 0;

        boolean report(){
            return singleQuote % 2 == 0 && doubleQuote % 2 == 0;
        }
    }
}
