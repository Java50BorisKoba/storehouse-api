package telran.storehouse.dto;

import java.io.Serializable;

public record SensorDataDto(long id, double fullness, long timestamp) implements Serializable {

}
