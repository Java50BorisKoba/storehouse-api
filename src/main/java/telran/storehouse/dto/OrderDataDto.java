package telran.storehouse.dto;

import java.io.Serializable;

public record OrderDataDto( 
		long orderId,  
		Coordinates coordinates,
		String productName,
		String productUnits, 
		long requiredQuantity, 
		long openTime, 
		long closeTime,
		String creator, 
		String status) implements Serializable {

}
