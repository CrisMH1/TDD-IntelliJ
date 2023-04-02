public class Coche {
    public int velocidad;

    public void acelerarChristian(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerarChristian(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad <0) velocidad= 0;
    }
}
