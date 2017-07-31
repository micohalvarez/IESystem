import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

import org.apache.log4j.BasicConfigurator;

import gate.Annotation;
import gate.AnnotationSet;
import gate.Corpus;
import gate.Document;
import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.LanguageAnalyser;
import gate.creole.ANNIEConstants;
import gate.util.GateException;
import gate.util.persistence.PersistenceManager;
import gate.Utils;
public class Driver {


		public static void main(String[] args) throws IOException, GateException {
			// TODO Auto-generated method stub
		
			
			Reader read = new Reader();
			Writer write = new Writer();
			   
			write.pars(read.getStdControl(), read.getNumber(),read.getControl(),read.getAsset(),read.getOrg(),read.getVulnerable(),
					read.getSecurity(),read.getSeverity(),read.getThreat(),read.getThreatOrigin(),read.getThreatSource());
			
			BasicConfigurator.configure();
		        Gate.init();

		        LanguageAnalyser controller = (LanguageAnalyser) PersistenceManager
		                .loadObjectFromFile(new File(new File(Gate.getPluginsHome(),
		                        ANNIEConstants.PLUGIN_DIR), ANNIEConstants.DEFAULT_FILE));
		     
		        Corpus corpus = Factory.newCorpus("corpus");
		        Document document = Factory.newDocument(
		                 read.getSentence().get(1));
		        corpus.add(document); controller.setCorpus(corpus); 
		        controller.execute();

//		        document.getAnnotations().get(new HashSet<>(Arrays.asList("Token", "Person", "Location")))
//		            .forEach(a -> System.err.format("%s - \"%s\" [%d to %d]\n", 
//		                    a.getType(), Utils.stringFor(document, a),
//		                    a.getStartNode().getOffset(), a.getEndNode().getOffset()));

//		        //Don't forget to release GATE resources 
//		        Factory.deleteResource(document); Factory.deleteResource(corpus); Factory.deleteResource(controller);
		
		        // POS TAGGER
			AnnotationSet tokens = document.getAnnotations();
			
			System.out.println(read.getSentence().get(0));
			for(Annotation t : tokens)
			  {
				
				if(t.getFeatures().get("kind") != null &&
						t.getFeatures().get("kind").toString().equalsIgnoreCase("word"))
					   System.out.println("POS TAG:" + t.getFeatures().get("category").toString());
			   
			 /* 
			  If looking for specific features go for
			  System.out.println( t.getFeatures().get("FeatureName").toString() );
			 */

			
			  }
			
			
		}
	
	

}
