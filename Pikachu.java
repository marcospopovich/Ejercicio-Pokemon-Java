public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }



    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque Placaje");

    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");

    }

    @Override
    public void atacarInpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impacto de Trueno");

    }

    @Override
    public void atacarPuniotrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Puños de Truenos");
    }

}
