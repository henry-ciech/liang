package eu.ciechanowiec.liang.chapter11_tasks.task_11_7;

import java.util.*;

class Shuffle {
    private static Random random;
    private static final int SHUFFLE_THRESHOLD = 5;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        shuffle(list);
    }

   private static void shuffle(List<?> list) {
        Random rnd = random;
        if (rnd == null) {
            random = rnd = new Random();
        }
        shuffle(list, rnd);
    }

    private static void shuffle(List<?> list, Random rnd) {
        int size = list.size();
        if (size < SHUFFLE_THRESHOLD || list instanceof RandomAccess) {
            for (int i = size; i > 1; i--) {
                swap(list, i - 1, rnd.nextInt(i));
            }
        } else {
            Object[] arr = list.toArray();
            for (int i = size; i > 1; i--) {
                swap(List.of(arr), i - 1, rnd.nextInt(i));
            }
            ListIterator it = list.listIterator();
            for (Object e: arr) {
                it.next();
                it.set(e);
            }
        }
    }

    private static void swap(List<?> list, int indexI, int indexJ) {
        final List list1 = list;
        Object element = list1.get(indexI);
        Object set = list1.set(indexJ, element);
        list1.set(indexI, set);
    }
}
