public abstract class Neuron implements ActivationFunction {
    private double[] input;
    private double[] weights;

    public Neuron(double[] i) {
        this.input = i;
        weights = new double[input.length];
        setRandRange(0, 1);
    }

    public void setRandRange(double randMin, double randMax) {
        for (int i = 0; i < weights.length; ++i) {
            weights[i] = randMin + (randMax - randMin) * Math.random();
        }
    }

    public double summingBlock() {
        double sum = 0.0;
        for (int i = 0; i < input.length; ++i) {
            sum += Math.abs(input[i] - weights[i]);
        }
        return sum;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public void setInput(double[] input) {
        this.input = input;
    }

    public double[] getInput() {
        return input;
    }

    public double[] getWeights() {
        return weights;
    }

}
