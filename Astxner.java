package parapunqiHandznararutyunner;

import java.util.Scanner;

public class Astxner {


    public static void main(String[] args) {
        System.out.println("nermutceq 1-10 tveric meky ev es kcuystam tonacar astxeri tesqov");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        astxnerArajin(number);
        astxnerErrord(number);
        astxnerChorrord(number);
        astxnerHingerord(number);
        astxnerVecerord(number);
        astxnerYoterord(number);
        astxnerUterord(number);
        astxnerInnerord(number);
        astxnerTaserord(number);

    }

    public static void astxnerArajin(int number) {
        if (number == 1) {
            tpelMekAstx();


        }

    }



    public static void astxnerErrord( int number ) {

        if (number == 3) {
            tpelMekAstx();
            tpelEreqAstx();
            tpelMekAstx();


        }
    }

    public static void astxnerChorrord( int number ) {

        if (number == 4) {
            tpelMekAstx();
            tpelEreqAstx();
            tpelChorsAstx();
            tpelEreqAstx();
            tpelMekAstx();


        }
    }

    public static void astxnerHingerord( int number ) {

        if (number == 5) {
            tpelMekAstx();
            tpelEreqAstx();
            tpelChorsAstx();
            tpelHingAstx();
            tpelChorsAstx();
            tpelEreqAstx();
            tpelMekAstx();

        }
    }

    public static void astxnerVecerord(int number ) {
        if (number == 6) {
            tpelMekAstx();
            tpelEreqAstx();
            tpelChorsAstx();
            tpelHingAstx();
            tpelVecAstx();
            tpelHingAstx();
            tpelChorsAstx();
            tpelEreqAstx();
            tpelMekAstx();
        }
    }

    public static void astxnerYoterord( int number ) {

        if (number  == 7) {
            tpelMekAstx();
            tpelEreqAstx();
            tpelChorsAstx();
            tpelHingAstx();
            tpelVecAstx();
            tpelYotAstx();
            tpelVecAstx();
            tpelHingAstx();
            tpelChorsAstx();
            tpelEreqAstx();
            tpelMekAstx();
        }
    }

    public static void astxnerUterord(int number) {

        if (number == 8) {
            tpelMekAstx();
            tpelEreqAstx();
            tpelChorsAstx();
            tpelHingAstx();
            tpelVecAstx();
            tpelYotAstx();
            tpelUtAstx();
            tpelYotAstx();
            tpelVecAstx();
            tpelHingAstx();
            tpelChorsAstx();
            tpelEreqAstx();
            tpelMekAstx();
        }
    }

    public static void astxnerInnerord(int number) {
        if (number== 9) {
            tpelMekAstx();
            tpelEreqAstx();
            tpelChorsAstx();
            tpelHingAstx();
            tpelVecAstx();
            tpelYotAstx();
            tpelUtAstx();
            tpelInyAstx();
            tpelUtAstx();
            tpelYotAstx();
            tpelVecAstx();
            tpelHingAstx();
            tpelChorsAstx();
            tpelEreqAstx();
            tpelMekAstx();
        }
    }

    public static void astxnerTaserord(int number) {
        if (number == 10) {
            tpelMekAstx();

            tpelEreqAstx();
            tpelChorsAstx();
            tpelHingAstx();
            tpelVecAstx();
            tpelYotAstx();
            tpelUtAstx();
            tpelInyAstx();
            tpelTasAstx();
            tpelInyAstx();
            tpelUtAstx();
            tpelYotAstx();
            tpelVecAstx();
            tpelHingAstx();
            tpelChorsAstx();
            tpelEreqAstx();
            tpelMekAstx();
        }
    }



    public static void tpelMekAstx() {

        System.out.println("            *        ");
    }


    public static void tpelEreqAstx() {

        System.out.println("        *   *   *      ");
    }

    public static void tpelChorsAstx() {

        System.out.println("      *   *   *   *     ");

    }

    public static void tpelHingAstx() {

        System.out.println("     *   *   *   *   *   ");
    }

    public static void tpelVecAstx() {

        System.out.println("    *   *   *   *   *   *   ");
    }

    public static void tpelYotAstx() {

        System.out.println("   *   *   *   *   *    *   *   ");
    }

    public static void tpelUtAstx() {

        System.out.println("  *   *   *   *   *   *   *   *  ");
    }

    public static void tpelInyAstx() {

        System.out.println(" *    *    *   *   *   *   *   *   * ");
    }

    public static void tpelTasAstx() {

        System.out.println("*   *   *   *    *   *   *    *   *   *");
    }
}