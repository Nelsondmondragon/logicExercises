package weekpreparation1;

public class TowerBreakers {

    public static void main(String[] args) {
        System.out.println(towerBreakers(5, 4));
    }

    public static int towerBreakers(int n, int m) {
        if (m == 1) {
            return 2;
        }
        return (n % 2 == 0) ? 2 : 1;
    }
}
