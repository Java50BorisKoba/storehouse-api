package telran.storehouse.dto;

import java.io.Serializable;

public record ContainerDataDto(long containerId, long sensorUsedId,
		Coordinates coordinates,double containerMaxVolume,double containerCurrentFullnes,String status,
		double thresholdValue,String productName,
		String productUnits) implements Serializable {

}
