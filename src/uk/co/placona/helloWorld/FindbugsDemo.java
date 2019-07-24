package uk.co.placona.helloWorld;

/**
 * @author Peter Yu 2019/7/24 14:14
 */
public class FindbugsDemo {

    public static void main(String[] args) {

        Bug bug = null;
        System.out.println(bug.report());
    }

    public static class Bug{

        String report(){
            return "I'm a bug!";
        }
    }
}
