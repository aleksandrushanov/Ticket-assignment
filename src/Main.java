import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String[] massive = new String[6];
        massive[0] = "BMW";
        massive[1] = "BMW";
        massive[2] = "Audi";
        massive[3] = "Audi";
        massive[4] = "VAZ";
        massive[5] = "VAZ";
        for (int i=0; i< massive.length;i++){
            for (int y = i+1; y < massive.length; y++) {
                if (Objects.equals(massive[i], massive[y])) {
                    massive[i] = "";
                    break;
                }
            }
            System.out.println(massive[i]+ ""); }
    }
}