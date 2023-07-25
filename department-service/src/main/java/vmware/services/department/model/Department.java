package vmware.services.department.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "department")
public class Department {

	@Id
	private String id;
	private Long organizationId;
	private String name;


}
