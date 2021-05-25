package edu.mycollections.array.phoneapp.service;

import edu.mycollections.array.phoneapp.model.Abonent;

public interface Service {

    Abonent[] createDefaultArr();
    void abWichTimeExceeds(Abonent[] abonents, int cityCallTime);
    void abWichUseInterCom(Abonent[] abonents);
    void abAlphSort(Abonent[] abonents);
    void selectSubWithMaxTraff(Abonent[] abonents);


}
