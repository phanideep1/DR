import net.sf.javaml.core.DenseInstance;
import net.sf.javaml.core.Instance;

import java.util.SortedSet;

import org.junit.Assert;

import net.sf.javaml.core.Dataset;
import net.sf.javaml.core.DefaultDataset;
import net.sf.javaml.tools.InstanceTools;

import java.io.File;
import java.io.IOException;

import net.sf.javaml.core.Dataset;
import net.sf.javaml.tools.data.FileHandler;



/**
 * This tutorial shows the very first step in using Java-ML. It will show you
 * how to create an {@link net.sf.javaml.core.Instance} that can later be used
 * in a {@link net.sf.javaml.core.Dataset} and in the machine learning
 * algorithms.
 * 
 * In this class we only work with the {@link net.sf.javaml.core.DenseInstance}.
 * This type of instance has a value for each attribute and has an optional
 * class label.
 * 
 * 
 */
public class KNNClassifier {

    /**
     * Shows how to construct an instance.
     * 
     * Here we will construct an instance with 10 attributes.
     * 
     */
    public static void main(String[] args) {
        /* values of the attributes. */
        double[] values = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        /*
         * The simplest incarnation of the DenseInstance constructor will only
         * take a double array as argument an will create an instance with given
         * values as attributes and no class value set. For unsupervised machine
         * learning techniques this is probably the most convenient constructor.
         */
        Instance instance = new DenseInstance(values);

        System.out.println("Instance with only values set: ");
        System.out.println(instance);
        System.out.println();
        /*
         * To create instances that have a class value set, you can use the two
         * argument constructor which takes the values and the class value as
         * parameters.
         */
        Instance instanceWithClassValue = new DenseInstance(values, 1);

        System.out.println("Instance with class value set to 1: ");
        System.out.println(instanceWithClassValue);
        System.out.println();
       
        /*
        Dataset data = new DefaultDataset();
        for (int i = 0; i < 10; i++) {
            Instance tmpInstance = InstanceTools.randomInstance(25);
            data.add(tmpInstance);
        }
         Retrieve all class values that are ever used in the data set 
        SortedSet<Object> classValues = data.classes();
        

        Assert.assertEquals(data.noAttributes(), 25);
        Assert.assertEquals(data.size(), 10);
        Assert.assertEquals(classValues.size(), 0);
        
        */
        Dataset data;
		try {
			data = FileHandler.loadDataset(new File("C:\\Users\\PHANIDEEP\\Desktop\\flow dataset 1.csv"), 4, ",");
			System.out.println(data);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

    }

}