package de.uni_mannheim.informatik.wdi.usecase.geography.evaluation.cities;

import de.uni_mannheim.informatik.wdi.datafusion.evaluation.EvaluationRule;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.numeric.PercentageSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.geography.FusableCity;

public class PopulationDensityEvaluationRule extends EvaluationRule<FusableCity>{
	
	PercentageSimilarity sim = new PercentageSimilarity(0.05d);

	@Override
	public boolean isEqual(FusableCity record1, FusableCity record2) {
		return sim.calculate(record1.getPopulationDensity(), record2.getPopulationDensity()) == 1.0;
	}
	

}