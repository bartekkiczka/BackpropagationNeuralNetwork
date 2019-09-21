public class App {

    public static void main(String[] args) throws Exception {

        CharacterReader characterReader = new CharacterReader();
        characterReader.readImage();

        float[][] trainingData = new float[][]{


                new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //0
                new float[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0}, //0
                new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //1
                new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //1
                new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //1
                new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //2
                new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0}, //3
                new float[]{0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0}, //4
                new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //4
                new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0}, //4
                new float[]{0,0,0,0,0,0,0,0,1,1,1,1,0,0,1,0,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0}, //5
                new float[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0}, //6
                new float[]{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,1,1,0,0,0,1,1,0,0,1,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //7
                new float[]{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,1,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //7
                new float[]{0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,0,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,0,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0}, //8
                new float[]{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,1,0,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0}, //9
        };


        float[][] trainingResults = new float[][]{

                new float[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},  // 0
                new float[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},  // 0
                new float[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0},  // 1
                new float[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0},  // 1
                new float[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0},  // 1
                new float[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0},  // 2
                new float[]{0, 0, 0, 1, 0, 0, 0, 0, 0, 0},  // 3
                new float[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},  // 4
                new float[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},  // 4
                new float[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},  // 4
                new float[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},  // 5
                new float[]{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},  // 6
                new float[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},  // 7
                new float[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},  // 7
                new float[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0},  // 8
                new float[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1},  // 9


        };

        BackpropNeuralNetwork backpropNeuralNetwork = new BackpropNeuralNetwork(64, 15, 10);

        for (int iteration = 0; iteration < NeuralNetConstants.ITERATIONS; iteration++) {
            for (int i = 0; i < trainingResults.length; i++) {
                backpropNeuralNetwork.train(trainingData[i], trainingResults[i], NeuralNetConstants.LEARNING_RATE, NeuralNetConstants.MOMENTUM);
            }

            if ((iteration + 1) % 1000 == 0) {

                System.out.println();
                for (int i = 0; i < trainingResults.length; i++) {
                    float[] data = trainingData[i];
                    float[] calculatedOutput = backpropNeuralNetwork.run(data);
                    System.out.println(calculatedOutput[0] + " " + calculatedOutput[1] +" "+ calculatedOutput[2] +" "+ calculatedOutput[3] +" "+ calculatedOutput[4] +" "+
                            calculatedOutput[5] +" "+ calculatedOutput[6] +" "+ calculatedOutput[7] +" "+ calculatedOutput[8] +" "+ calculatedOutput[9]);

                }
            }
        }

        System.out.println("after the training, predictions: ");
        System.out.println("------------------------------------------------");

        float[] calculatedOutput = backpropNeuralNetwork.run(new float[] { 0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0 });
        System.out.println(calculatedOutput[0] + " " + calculatedOutput[1] +" "+ calculatedOutput[2] +" "+ calculatedOutput[3] +" "+ calculatedOutput[4] +" "+
                calculatedOutput[5] +" "+ calculatedOutput[6] +" "+ calculatedOutput[7] +" "+ calculatedOutput[8] +" "+ calculatedOutput[9]);

        for(int i=0; i<calculatedOutput.length; i++){
            if(Math.round(calculatedOutput[i]) == 1) {
                System.out.println("The number is: " + i);
            }
        }

    }

    }



