package chap16_Mediator;

public interface Mediator {
    public abstract void createColleagues();

    public abstract void colleagueChanged(Colleague colleague);
}
