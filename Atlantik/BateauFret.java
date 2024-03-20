public class BateauFret extends Bateau
{
    private Double poidsmaxBatFret;

    public BateauFret(String unId, String unNom, Double uneLong, Double uneLarg, Double unPoidsMax ) {
        super(unId, unNom, uneLong, uneLarg);
        this.poidsmaxBatFret = unPoidsMax;
    }

    public Double getPoidsMax() {
        return this.poidsmaxBatFret;
    }

    public void setPoidsMax(Double poidsmaxBatFret) {
        this.poidsmaxBatFret = poidsmaxBatFret;
    }
}