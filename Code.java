public class Устинов8ПроверкаОрфографии {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();

        Pair b = dict.verification("демократ");
        System.out.println(b.word);
    }

}

class Dictionary {

    String[] ar;
    

//подсчет разности строк
    int distance(String str1, String str2) {
        int difference = 0;
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                difference++;
            }
        }

        if (str1.length() > str2.length()) {
            difference += str1.length() - str2.length();
        } else {
            difference += str2.length() - str1.length();
        }

        return difference;
    }
//поиск минимального уровня разности между заданной строкой и строками в массиве

    Pair verification(String str) {
        int ind_min = 0;
        String word_min = ar[0];
        int distance_min = distance(str, ar[0]);
        for (int i = 0; i < ar.length; i++) {
            if (distance(str, ar[i]) < distance_min) {
                ind_min = i;
                word_min = ar[i];
                distance_min = distance(str, ar[i]);

            }

        }
        Pair p = new Pair();
        p.ind = ind_min;
        p.word = word_min;
        return p;
    }

    public Dictionary() {
        ar = new String[5];
        ar[0] = "демократия";
        ar[1] = "коммунизм";
        ar[2] = "олигархия";
        ar[3] = "социализм";
        ar[4] = "тирания";
    }
}

class Pair {

    int ind;
    String word;
}
