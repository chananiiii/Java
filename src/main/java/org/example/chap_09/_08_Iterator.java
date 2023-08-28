package org.example.chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // Iterator
        // Data 순회
        // 처음에 커서 위치해놓고 ,그 다음 탐색하는 것
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println();

        iterator = list.iterator(); // 커서를 처음으로 이동
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = list.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            if(s.contains("(알 수 없음)")) {
                iterator.remove(); // 삭제
            }
        }

        System.out.println();

        iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        HashSet <String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");

        Iterator <String> it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("김종국", 20);

        Iterator<String> iterator2 = map.keySet().iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println();

        Iterator <Integer> itMapValue = map.values().iterator();
        while(itMapValue.hasNext()){
            System.out.println(itMapValue.next());
        }

        Iterator<Map.Entry<String, Integer>> iterator3 = map.entrySet().iterator();
        while(iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
    }
}
