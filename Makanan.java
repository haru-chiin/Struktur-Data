public class Makanan extends  hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " dimakan";
    }
}