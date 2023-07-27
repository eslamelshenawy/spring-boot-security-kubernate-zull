package vmware.services.organization.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import vmware.services.organization.util.Constant;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "organization")
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@NotBlank(message = Constant.NOT_BLANK + " .. name")
	private String name;
	@NotBlank(message = Constant.NOT_BLANK + "  .. address")
	private String address;

}
