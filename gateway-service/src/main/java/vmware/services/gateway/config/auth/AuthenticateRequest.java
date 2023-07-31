package vmware.services.gateway.config.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticateRequest {
    private  String userName;
    private String password;
}
