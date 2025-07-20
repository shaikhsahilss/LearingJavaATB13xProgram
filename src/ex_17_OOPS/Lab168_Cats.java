package ex_17_OOPS;

public class Lab168_Cats {
    Lab168_Cats(){
        System.out.println("DC - Main Class");
    }
    public static void main(String[] args) {
        cat c1 = new cat();
        new cat();
        cat c2;
        c1.runing();
        new cat().runing();
        new Lab168_Cats();
    }

    static class  cat {
        String name;
        void runing(){
            System.out.println("Running");
        }
    }
}
