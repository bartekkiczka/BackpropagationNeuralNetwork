public class BackpropNeuralNetwork {

    private Layer[] layers;

    public BackpropNeuralNetwork(int inputSize, int hiddenSize, int outputSize){

        layers = new Layer[2];
        layers[0] = new Layer(inputSize, hiddenSize);
        layers[1] = new Layer(hiddenSize, outputSize);
    }

    public Layer getLayer(int index){
        return layers[index];
    }

    public float[] run(float[] input){

        float[] activations = input;
        for(int i = 0; i < layers.length; i++)
            activations = layers[i].run(activations);

        return activations;
    }

    public void train(float[] input, float[] targetOutput, float learningRate, float momentum){

    }
}
