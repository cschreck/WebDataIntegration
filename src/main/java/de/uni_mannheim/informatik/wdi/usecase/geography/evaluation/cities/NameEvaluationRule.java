package de.uni_mannheim.informatik.wdi.usecase.geography.evaluation.cities;

import de.uni_mannheim.informatik.wdi.datafusion.evaluation.EvaluationRule;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.SimilarityMeasure;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.TokenizingJaccardSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.geography.FusableCity;

public class NameEvaluationRule extends EvaluationRule<FusableCity>{
	
	SimilarityMeasure<String> sim = new TokenizingJaccardSimilarity();

	@Override
	public boolean isEqual(FusableCity record1, FusableCity record2) {
		// the title is correct if all tokens are there, but the order does not matter
//		System.out.println("Name: " + record1.getName() + "&" + record2.getName() + " = " + sim.calculate(record1.getName(), record2.getName()));
		return sim.calculate(record1.getName(), record2.getName()) == 1.0;
	}

}
