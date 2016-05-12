import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
 
import java.io.File;
 
public class CSV2Arff {
  /**
   * takes 2 arguments:
   * - CSV input file
   * - ARFF output file
   */
  public static void main(String[] args) throws Exception {
   /* if (args.length != 2) {
      System.out.println("\nUsage: CSV2Arff <input.csv> <output.arff>\n");
      System.exit(1);
    }
 */
    // load CSV
    CSVLoader loader = new CSVLoader();
    loader.setSource(new File("C:\\Users\\PHANIDEEP\\Desktop\\testdata.csv"));
    Instances data = loader.getDataSet();
 
    // save ARFF
    ArffSaver saver = new ArffSaver();
    saver.setInstances(data);
    saver.setFile(new File("C:\\Users\\PHANIDEEP\\Desktop\\testdata.arff"));
    //saver.setDestination(new File("C:\\Users\\PHANIDEEP\\Desktop\\flow dataset 1.arff"));
    saver.writeBatch();
  }
}