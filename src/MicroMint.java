import java.util.ArrayList;
import java.util.Random;


public class MicroMint {
    private Random rand;
    private int[] bins;
    private ArrayList<Integer> usedCoins;
    private int nbrRounds;
    private int nbrCoins;
    private int nbrBins;

    public MicroMint() {

    }


    public int getRoundsFor(int u, int k, int c) {
        rand = new Random();
        usedCoins = new ArrayList<>();
        nbrBins = (int) Math.pow(2, u);
        nbrCoins = 0;
        nbrRounds = 0;
        bins = new int[nbrBins];

        while (nbrCoins < c) {
            int bin = rand.nextInt(nbrBins);

            //while (usedCoins.contains(bin)){
            //    bin = rand.nextInt(nbrBins);
            //}

            bins[bin]++;

            if (bins[bin] == k) {
                //usedCoins.add(bin);
                nbrCoins++;
                bins[bin] = 0;
            }
            nbrRounds++;
        }


        return nbrRounds;
    }


}
