package lt.baltictalents.p14.demo7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listI = new ArrayList<>();
        List<? extends Number> listN;

        listN = listI;

    }
}
