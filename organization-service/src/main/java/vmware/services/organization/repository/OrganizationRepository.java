package vmware.services.organization.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vmware.services.organization.entity.Organization;

public interface OrganizationRepository extends MongoRepository<Organization, String> {
	
}
