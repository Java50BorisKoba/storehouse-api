package telran.storehouse.dto;

public record ContainerDataDto(long containerId, long sensorUsedId,
		Coordinates coordinates,double containerMaxVolume,double containerCurrentFullnes,String status,
		double thresholdValue,String productName,
		String productUnits) {

}
