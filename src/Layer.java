import java.util.Arrays;
import java.util.Random;

public class Layer {

    private float[] output;
    private float[] input;
    private float[] weights;
    private float[] dWeights;
    private Random random;

    public Layer(int inputSize, int outputSize){
        this.output = new float[outputSize];
        this.input = new float[inputSize+1];
        this.weights = new float[(inputSize+1)*outputSize];
        this.dWeights = new float[weights.length];
        this.random = new Random();

        initWeights();
    }

    private void initWeights(){
        for(int i=0; i<weights.length; i++)
            weights[i] = (random.nextFloat()-0.5f) * 4f;
    }

    public float[] run(float[] inputArray){

        System.arraycopy(inputArray,0,input,0,inputArray.length);

        input[input.length-1]=1;
        int offset = 0;

        for(int i=0; i<output.length; i++){
            for(int j=0; j<input.length; j++){
                output[i] += weights[offset+j]*input[j];
            }
            output[i] = ActivationFunction.sigmoid(output[i]);
            offset += input.length;
        }
        return Arrays.copyOf(output, output.length);
    }

    public float[] train(float[] error, float learningRate, float momentum){

    }
}
