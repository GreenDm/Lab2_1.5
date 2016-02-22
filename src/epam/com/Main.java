package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {

    public static void main(String[] args) {


        int [] arr = {1,2,1,2,1};

        Computer computer1 = new Computer();
        computer1.setPrice(100.0F);
        for(int elemetn:arr) {
            computer1.setPrice(computer1.getPrice()+computer1.res());
            System.out.println();
            System.out.println(computer1.getPrice());

        }
        computer1.view();
    }
}
