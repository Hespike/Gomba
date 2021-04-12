public class Gomba {
    private boolean eheto;
    private double meret;

    @Override
    public String toString() {
        return "Gomba{" +
                "eheto=" + eheto +
                ", meret=" + meret +
                '}';
    }

    public Gomba(boolean eheto, double meret) {
        this.eheto = eheto;
        this.meret = meret;
    }

public static int ehetokSzama(Gomba[] gombak) {
        int eheto = 0;
        for ( Gomba gomba : gombak) {
            if (gomba.eheto) {
                eheto++;
            }
        }
        return eheto;
}

public static Gomba legnagyobbEheto(Gomba[] gombak) {
        Gomba legnagyobb = null;

        for ( Gomba gomba: gombak) {
            if (gomba.eheto) {
                if (legnagyobb == null) {
                    legnagyobb = gomba;
                } else if (gomba.meret > legnagyobb.meret) {
                    legnagyobb = gomba;
                }
            }
        }
        return legnagyobb;
}

public static Gomba[] nagyobbak(Gomba[] gombak) {
        double atlag = 0;
        for (Gomba gomba: gombak) {
            atlag += gomba.meret;
        }

        atlag /= gombak.length;

        int nagyobbakSzama = 0;
        for (Gomba gomba: gombak) {
            if(gomba.meret > atlag) {
                nagyobbakSzama++;
            }
        }

        Gomba[] nagyGombak = new Gomba[nagyobbakSzama];
        int j = 0;
        for (Gomba gomba: gombak) {
            if (gomba.meret > atlag) {
                nagyGombak[j] = gomba;
                j++;
            }
        }

        return nagyGombak;
  }

}
