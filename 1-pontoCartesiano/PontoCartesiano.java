public class PontoCartesiano {
    private double x;
    private double y;


    public PontoCartesiano(double x, double y) { 
        this.x = x;
        this.y = y;
    }



    public double getX() { 
        return x; 
    }
    public double getY() { 
        return y; 
    }
    
    public void setX (double x) { 
        this.x = x; 
    }
    public void setY (double y) { 
        this.y = y;
    }

    public double calcularDistanciaEuclidiana(PontoCartesiano ponto) {
        double diferencaX = ponto.x - this.x;
        double diferencaY = ponto.y - this.y;
        double distancia = Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));
        return distancia;
    
    }
        

}
