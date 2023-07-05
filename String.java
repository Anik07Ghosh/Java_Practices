public class Main {
    public static void main(String[] args) {
        String name = "ANIK";
        String title = "GHOSH";
        String full_name = name + title;
        System.out.println(name.charAt(2));
        String replace = name.replace('A','B');
        System.out.println(replace);
        System.out.println(full_name.substring(0,4));
    }
}