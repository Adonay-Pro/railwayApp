package railwayapp;

public class Loading<P, C> {

    private P people;
    private C cargo;

    public Loading(P people, C cargo){
        this.people = people;
        this.cargo = cargo;
    }

    public P getPeople() {
        return people;
    }

    public C getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "people=" + people + " cargo=" + cargo;
    }
}
