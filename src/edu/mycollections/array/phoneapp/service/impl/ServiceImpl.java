package edu.mycollections.array.phoneapp.service.impl;

import edu.mycollections.array.phoneapp.model.Abonent;
import edu.mycollections.array.phoneapp.model.impl.AbonentArrayImpl;
import edu.mycollections.array.phoneapp.model.impl.Employee;
import edu.mycollections.array.phoneapp.model.impl.Schoolar;
import edu.mycollections.array.phoneapp.model.impl.Student;
import edu.mycollections.array.phoneapp.service.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ServiceImpl implements Service {

    @Override
    public  Abonent[] createDefaultArr() {

        AbonentArrayImpl abonentArray = new AbonentArrayImpl(12);

        Student st1 = new Student(109, "Константин", "Нямцу",
                "ак.Глушко 25, кв.155","+38056733772",
                "1231-6474-9885-2111", 1500,988,
                90, 45, 2000,
                "IT", 3, "КА - 31");
        Student st2 = new Student(21, "Артем", "Власов",
                "ул.Ильфа и Петрова 22, кв.200","+38098436426",
                "3142-6752-2322-4411", 950,700,
                115, 30, 4000,
                "Managment", 1, "M - 19");
        Student st3 = new Student(8, "Илья", "Обуховский",
                "ак.Королева, кв.2","+38069337701",
                "5231-6411-8632-2456", 230,200,
                15, 0, 10000,
                "IT", 2, "КА - 22");
        Student st4 = new Student(98, "Юлия", "Сокуренко",
                "ул.Заболотного 52, кв.1","+38069992324",
                "9523-6342-2345-6433", 390,120,
                300, 100, 0,
                "Managment", 4, "M - 42");
        Employee emp1 = new Employee(43,"Иван", "Васнецов",
                "ул.Вильямса 12, кв.21", "+38091237645",
                "1217-6431-7541-2152", 2000 , 1880,
                100, 20, 1000, "engineer", 12);
        Employee emp2 = new Employee(2425,"Николай", "Кузнецов",
                "ул.Дачная 58, кв.79", "+38061238531",
                "6652-1242-5631-7534", 1000 , 430,
                1000, 0, 5000, "software engineer", 234);
        Employee emp3 = new Employee(123,"Анна", "Кузнецова",
                "ул.Красноармейска 99, кв.6", "+38079213218",
                "3125-8888-4326-8975", 550 , 395,
                10, 20, 5200, "manager", 67);
        Employee emp4 = new Employee(24,"Валентин", "Яшев",
                "ул.Пантелимоская 7, кв.2", "+38079234976",
                "6652-1242-5631-7534", 1000 , 630,
                80, 80, 1500, "engineer", 32);
        Schoolar sch1 = new Schoolar(999, "Мария", "Бойко", "ул.Пушкинская 3б, кв.12",
                "+38091242569", "9432-1267-1216-7752", 540, 320, 75, 65,
                2000, 72);
        Schoolar sch2 = new Schoolar(52, "Валерия", "Жмышенко", "ул.Московская 23ба, кв.64",
                "+38068311899", "1122-2244-7543-8745", 230, 132, 20, 78,
                100, 65);
        Schoolar sch3 = new Schoolar(123214, "Иван", "Руденко", "ул.Киевская 3б, кв.122",
                "+38053267712", "2151-5485-2346-9567", 786, 653, 79, 22,
                4632, 632);
        Schoolar sch4 = new Schoolar(745, "Богдан", "Петров", "ул.Стельмаха 68, кв.7",
                "+38067236967", "6668-9994-3256-8665", 100, 59, 21, 75,
                580, 77);

        abonentArray.insertAbonentToArr(st1,0);
        abonentArray.insertAbonentToArr(st2,1);
        abonentArray.insertAbonentToArr(st3,2);
        abonentArray.insertAbonentToArr(st4,3);
        abonentArray.insertAbonentToArr(emp1,4);
        abonentArray.insertAbonentToArr(emp2,5);
        abonentArray.insertAbonentToArr(emp3,6);
        abonentArray.insertAbonentToArr(emp4,7);
        abonentArray.insertAbonentToArr(sch1,8);
        abonentArray.insertAbonentToArr(sch2,9);
        abonentArray.insertAbonentToArr(sch3,10);
        abonentArray.insertAbonentToArr(sch4,11);

        return abonentArray.getAbonents();


    }

    @Override
    public void abWichTimeExceeds(Abonent[] abonents, int cityCallTime) {

        for (Abonent abonent : abonents) {
            if (abonent.getCityCallTime() > cityCallTime) {
                System.out.println(abonent);
            }
        }
    }

    @Override
    public void abWichUseInterCom(Abonent[] abonents) {

        for (Abonent abonent : abonents) {
            if (abonent.getInternCallTime() != 0) {
                System.out.println(abonent);
            }
        }
    }

    @Override
    public void abAlphSort(Abonent[] abonents) {
        Arrays.sort(abonents, new Comparator<Abonent>() {
            @Override
            public int compare(Abonent o1, Abonent o2) {

               int res = o1.getName().compareTo(o2.getName());

               if (res == 0 ){
                   return o1.getSurname().compareTo(o2.getSurname());
               }

               return res;
            }
        });
    }

    @Override
    public void selectSubWithMaxTraff(Abonent[] abonents) {

        Arrays.sort(abonents, new Comparator<Abonent>() {
            @Override
            public int compare(Abonent o1, Abonent o2) {

                if (o1.getInternetTraffic() > o2.getInternetTraffic()) {
                    return -1;
                } else if (o1.getInternetTraffic() == o2.getInternetTraffic()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

    }


}
