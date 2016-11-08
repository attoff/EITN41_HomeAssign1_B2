import java.util.ArrayList;
import java.util.Random;


public class MicroMint {
    private Random rand;
    private int[] bins;
    private int[] usedCoins;
    private int nbrRounds;
    private int nbrCoins;
    private int nbrBins;

    public MicroMint() {

    }


    public int getRoundsFor(int u, int k, int c) {
        rand = new Random();
        nbrBins = (int) Math.pow(2, u);
        nbrCoins = 0;
        nbrRounds = 0;
        bins = new int[nbrBins];
        usedCoins = new int[nbrBins];

        while (nbrCoins < c) {
            int bin = rand.nextInt(nbrBins);

            while (usedCoins[bin]==1){
                bin = rand.nextInt(nbrBins);
            }

            bins[bin]++;

            if (bins[bin] == k) {
                usedCoins[bin]=1;
                nbrCoins++;
                //bins[bin] = 0;
            }
            nbrRounds++;
        }


        return nbrRounds;
    }


}
