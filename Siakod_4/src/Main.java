public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.set("book1", "author1");
        myHashMap.set("book2", "author2");
        myHashMap.set("book3", "author3");
        myHashMap.set("book3", "author4");
        myHashMap.set("book5", "author5");
        myHashMap.set("book6", "author6");
        myHashMap.display();
        System.out.println(myHashMap.get("book3"));
        myHashMap.remove("book6");
        myHashMap.display();
    }
}