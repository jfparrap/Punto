public class Linea{
  private Punto inicio, fin;
  public double longitud(){
    return inicio.distancia(fin);
  }
  public void moverX(double delta){
    inicio.moverX(delta);
    fin.moverX(delta);
  }
}
