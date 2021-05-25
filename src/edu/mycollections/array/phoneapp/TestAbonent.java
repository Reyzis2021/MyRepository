package edu.mycollections.array.phoneapp;


import edu.mycollections.array.phoneapp.model.Abonent;
import edu.mycollections.array.phoneapp.service.impl.ServiceImpl;

import java.util.Arrays;

public class TestAbonent {

    public static void main(String[] args) {

        ServiceImpl service = new ServiceImpl();
        Abonent[] abonents = service.createDefaultArr();
        System.out.println(Arrays.toString(abonents));
        System.out.println("=================================================");
        service.abWichTimeExceeds(abonents, 70);
        System.out.println("=================================================");
        service.abWichUseInterCom(abonents);
        System.out.println("=================================================");
        service.abAlphSort(abonents);
        System.out.println(Arrays.toString(abonents));
        System.out.println("=================================================");
        service.selectSubWithMaxTraff(abonents);
        System.out.println(Arrays.toString(abonents));
        System.out.println("=================================================");
    }
}
