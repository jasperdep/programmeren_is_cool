
public class Main {

    public static void main(String[] args){

//        int a;
//
//        if( 2 == 2 ) a = 2; else a = 5;
//            System.out.println(a);
//
//        while ( a < 5 ) a++;
//            System.out.println(a);
//
//        for ( a = 5; a < 100; a++);
//        System.out.println(a);

    }

    public class Scoping {

        private int x = 7;

        private void Orange() {

            int y = 0;
            int z = x + y;

            System.out.println(x);

        }

        public void Purple(){

            int x = 0, y = 1;
            int z = x + y;

            System.out.println(x);

        }

    }

}
