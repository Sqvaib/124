public class CacheTest {
    public static void main(String[] args) {
        System.out.println("Cache Integer");
        Cache<Integer> intCache = new Cache<>(3);

        System.out.println("Элементы 1, 2, 3:");
        intCache.add(1);
        intCache.add(2);
        intCache.add(3);
        System.out.println("Кэш: " + intCache);

        System.out.println("\nЭлемент 4:");
        intCache.add(4);
        System.out.println("Кэш: " + intCache);

        System.out.println("\nПроверка существования:");
        System.out.println("exists2: " + intCache.exists(2));
        System.out.println("exists1: " + intCache.exists(1));

        System.out.println("\nПолучение элементов:");
        System.out.println("getFirst(): " + intCache.getFirst());
        System.out.println("getLast(): " + intCache.getLast());
        
        System.out.println("\nПолучение по индексу:");
        System.out.println("getItemByIndex0: " + intCache.getItemByIndex(0));
        System.out.println("getItemByIndex2: " + intCache.getItemByIndex(2));
        System.out.println("getItemByIndex5: " + intCache.getItemByIndex(5));
        
        System.out.println("\nУдаление элементов:");
        System.out.println("remove2: " + intCache.remove(2));
        System.out.println("Кэш после удаления: " + intCache);
        System.out.println("remove10: " + intCache.remove(10));
        
        System.out.println("\nCache String");
        Cache<String> stringCache = new Cache<>(2);
        
        stringCache.add("Hello");
        stringCache.add("World");
        System.out.println("Кэш строк: " + stringCache);
        
        stringCache.add("Java");
        System.out.println("После добавления 'Java': " + stringCache);
        
        System.out.println("getFirst(): " + stringCache.getFirst());
        System.out.println("getLast(): " + stringCache.getLast());
    }
}