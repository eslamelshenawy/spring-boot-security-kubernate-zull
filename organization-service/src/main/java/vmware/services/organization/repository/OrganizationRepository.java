package vmware.services.organization.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vmware.services.organization.entity.Organization;
@Repository
public interface OrganizationRepository extends MongoRepository<Organization, String> {

}
