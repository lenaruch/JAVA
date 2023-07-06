package Lesson_3;

import java.util.ArrayList;
import java.util.List;


public class L3_Task_4 {
    static List<List<String>> shopBook = new ArrayList<>();
    public static void main(String[] args) {
        addBook("СЃРєР°Р·РєРё", "РєРѕР»РѕР±РѕРє");
        addBook("С„Р°РЅС‚Р°СЃС‚РёРєР°", "РіР°СЂСЂРё РїРѕС‚С‚РµСЂ");
        addBook("С„Р°РЅС‚Р°СЃС‚РёРєР°", "РіР°СЂСЂРё РїРѕС‚С‚РµСЂ");
        addBook("СЃРєР°Р·РєРё", "РєСѓСЂРѕС‡РєР° СЂСЏР±Р°");
        addBook("СЂРѕРјР°РЅ", "СЂРѕРјРµРѕ Рё РґР¶СѓР»СЊРµС‚С‚Р°");
        addBook("Р РѕРјР°РЅ", "РІРѕР№РЅР° Рё РјРёСЂ");
        addBook("С„Р°РЅС‚Р°СЃС‚РёРєР°", "РЅРѕС‡РЅРѕР№ РґРѕР·РѕСЂ");
        addBook("СЃРєР°Р·РєРё", "Р·РѕР»РѕС‚РѕР№ РїРµС‚СѓС€РѕРє");

        System.out.println(shopBook);
    }

    static void addBook(String genreBook, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            //РєРЅРёР¶РЅР°СЏ РїРѕР»РєР°
            List<String> genreList = shopBook.get(i);
            String genre = genreList.get(0);
            if (genreBook.equalsIgnoreCase(genre)){
                if (!genreList.contains(nameBook)) {
                    genreList.add(nameBook);
                }
                return;
            }
        }

        List<String> list = new ArrayList<>();
        list.add(genreBook);
        list.add(nameBook);
        shopBook.add(list);
    }
}
