package services;

public class AlignmentStrategyFactory {
	private AlignStrategy strategiesPrototypes;
	
	public AlignStrategy create(AlignStrategy textAlignment) {
		return textAlignment;
		
	}

	public AlignStrategy getStrategiesPrototypes() {
		return strategiesPrototypes;
	}

	public void setStrategiesPrototypes(AlignStrategy strategiesPrototypes) {
		this.strategiesPrototypes = strategiesPrototypes;
	}
}
