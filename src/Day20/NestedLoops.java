package Day20;

public class NestedLoops {
    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) {
//            System.out.println(i+" week");
//
//            for(int j = 1; j <= 7; j++){
//                System.out.println(j+" day");
//            }
//        }

//        int i = 1;
//        while(i<=3){
//            System.out.println(i +" week");
//            i++;
//            int j = 1;
//            while(j<=7){
//                System.out.println(j+" day");
//                j++;
//            }
//        }

//        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= 10; j++){
//                System.out.print(10+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 10; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        for(int i = 10; i>=1; i--){

            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
