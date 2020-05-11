public class Calculations {
    private float lambda;
    private float mu;

    public void setLambda(float lambda) {
        this.lambda = lambda;
    }

    public void setMu(float mu) {
        this.mu = mu;
    }

    public float L() {
        return lambda/(mu-lambda);
    }

    public float W() {
        return 1/(mu-lambda);
    }
    
    public float Lq() {
        return (lambda*lambda)/(mu*(mu-lambda));
    }

    public float Wq(){
        return (lambda)/(mu*(mu-lambda));
    }
    
    public float P(){
        return (lambda / mu);
    }
    
    public float P0(){
        return (1-(lambda/mu));
    }
    
    /* public float Pnk (){
        return ()
    } 
*/
    
}
