public class App {
    public static void main(String[] args) throws Exception {
        Stat stat = new Stat();
        stat.moyenne();
        stat.mediane();
        stat.quartiles();
        System.out.println(stat.toString());

    }
}
