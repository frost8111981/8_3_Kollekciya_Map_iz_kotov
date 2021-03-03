package com.frost;
import java.util.Map;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);     // коллекция на вывод через метод

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> result = new HashMap<>();
        for(int i =0; i< cats.length; i++){
            Cat cat = new Cat(cats[i]);
            result.put(cats[i], new Cat(cats[i]));//Добавляем в map ключем будет имя кота из массива, данными обьект кэт, сразу создаем и добавляем
        }
        return result;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
