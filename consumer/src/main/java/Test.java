/**
 * Created by shifengqiang on 17/3/10.
 */
public class Test {
    public static void main(String[] args) {
        searchLowestCommonMultiple(10, 2);

    }

    public static void searchLowestCommonMultiple(int num1, int num2) {
        int bigger;
        int smaller;
        if (num1 > num2) {
            bigger = num1;
            smaller = num2;
        } else {
            bigger = num2;
            smaller = num1;
        }

        for (int i = bigger; i <= bigger * smaller; i++) {
            if (i % bigger == 0 && i % smaller == 0) {
                System.out.println("lowest common multiple of " + num1 + " and "+ num2 + "num2 is:" +  i);
                break;
            }
        }
    }
}
