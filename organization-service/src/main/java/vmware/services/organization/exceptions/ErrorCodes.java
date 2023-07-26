package vmware.services.organization.exceptions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum ErrorCodes {
	org$0001("No Organization found with Id !");

	@Getter
	@JsonValue
    private final String value;
	
	@JsonCreator
	ErrorCodes(String value) {
        this.value = value;
    }
}
