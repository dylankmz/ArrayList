public class Fruit {

    protected String naam;
    protected boolean eetbaar;

    public boolean isEetbaar() { //isEetbaar = 'Is' omdat het een Boolean is.
        return eetbaar;
    }

    public void setEetbaar(boolean eetbaar) {
        this.eetbaar = eetbaar;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
