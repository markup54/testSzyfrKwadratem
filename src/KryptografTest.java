import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KryptografTest {

    @Test
    void szyfrujJezeliPusteSlowo() {
        String  oczekiwana = "";
        String aktualna = Kryptograf.szyfruj("");
        Assertions.assertEquals(oczekiwana,aktualna);
    }
    @Test
    void szyfrujJezeliDlugoscMaPierwiastekCalkowity() {
        String  oczekiwana = "mmaa";
        String aktualna = Kryptograf.szyfruj("mama");
        Assertions.assertEquals(oczekiwana,aktualna);
    }
    @Test
    void szyfrujJezeliDlugoscDowolna() {
        String  oczekiwana = "prs rat oma gi";
        /*
        prog
        rami
        sta_
        ____
         */
        String aktualna = Kryptograf.szyfruj("programista");
        Assertions.assertEquals(oczekiwana,aktualna);
    }
    @Test
    void szyfrujJezeliDlugoscDowolnaPodwojnaSpacja() {
        String  oczekiwana = "ams laa a    p";

        String aktualna = Kryptograf.szyfruj("ala ma psa");
        Assertions.assertEquals(oczekiwana,aktualna);
    }
    @Test
    void szyfrujJezeliOdszyfrowanie() {
        String  oczekiwana = "programista";
        /*
        prog
        rami
        sta_
        ____
         */
        String aktualna = Kryptograf.szyfruj("prs rat oma gi");
        Assertions.assertEquals(oczekiwana,aktualna);
    }

}