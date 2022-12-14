# Protein-secondary-structure-prediction
ANN model to predict secondary structure of a protein



Secondary protein structure carries information about local structural arrangements, which include three significant conformations: α-helices, β-strands, and coils. A feed-forward neural network was developed to predict a protein's secondary structure. Various classes were created for training the neural network. 


-LineReader: This class facilitates the file reading process, such as reading pattern files, configuration files and weight files.

-Neuron: It represents a neuron that is responsible for the processing. The class has two constructors, one for input units and the other for hidden and output units.


-NeuralNet: It simply represents a neural net. It has two constructors, one for creating an MLP with given parameters and the other for creating generalized feed-forward nets. It reads a configuration file and creates a net out of the parameters in this file.


-Pattern: It represents a single training pattern, including input and target data.


-PatternSet: It represents a set of patterns, i.e. training set (80%), the cross-validation data set (10%) and the test data set (10%) to be used during training.


-Randomizer: It generally coordinates random number generation.


-Synapse: It represents a synapse between two neurons.


-Config: Creates a configuration file for a neural network with NNC extension.


-IPconverter: Creates the file having data set with input and output values.


-PredictStructure: Predicts the secondary structure.

 
 

The training was done to teach the network to recognize the relationship between secondary structure and amino acid sequences on a sample set of 105 proteins of a known structure belonging to different structural classes of the SCOP database. The weight file generated by the neural network was used to predict a test set of 25 protein sequences. The developed artificial neural network achieved a maximum overall predictive accuracy of 61.4539% for three states: helix, sheet, and coil.

