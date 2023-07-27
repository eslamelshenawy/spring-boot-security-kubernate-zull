package vmware.services.organization.web;

import com.mongodb.annotations.NotThreadSafe;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import vmware.services.organization.entity.Organization;
import vmware.services.organization.response.Response;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpStatus.OK;

@RunWith(SpringRunner.class)
@NotThreadSafe
public class OrganizationControllerTests extends AbstractTestWithTempBaseDir{

    @Autowired
    private TestRestTemplate template;

    @Test
    public void testFindAll() {
        ResponseEntity<Response<List<Organization>>> res = template
                .exchange(
                        "/organization/all",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<Response<List<Organization>>>(){});
        assertEquals(HttpStatus.OK, res.getStatusCode());
    }

}
