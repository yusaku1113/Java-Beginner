import java.util.*;

public class MenuManager {
    Map<String, ArrayList<String>> map;

    MenuManager() {
        map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch", list);
        // ドリンクメニューの登録
        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink", list);
        // サイドメニューの登録
        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu", list);
    }

    void searchMenu(String menu) {
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            String category = entry.getKey();
            ArrayList<String> item = entry.getValue();
            if (item.contains(menu)) {
                System.out.println(menu + "は" + category + "含まれます。");
                return;
            }
        }
        System.out.println("該当するメニューはありません。");

    }

    void setMenu(String category, String menu) {
        if (map.containsKey(category)) {
            map.get(category).add(menu);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(menu);
            map.put(category, list);
        }
    }

    void showMenu(String category) {
        if (map.containsKey(category)) {
            System.out.println(map.get(category));

        } else {
            System.out.println("該当するカテゴリーはありません。");
        }

    }

}
